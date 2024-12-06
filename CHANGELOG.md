# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## [Unreleased]

## [2024.08.07]

### Added

- Added `/bin` to `.gitignore`, so binaries are no longer committed
- Added the TODO tree extensions to `extensions.json`
- Added the `todo-tree.general.showActivityBarBadge` setting to `settings.json`
- Added the `todo-tree.tree.showCountsInTree` setting to `settings.json`
- Added the VSCode PDF extension to `extensions.json`
- Added `java.debug.settings.vmArgs` setting to enable assertions (i.e., `-ea`)
- Added information about making branches to all parts of the project
- Added information about how to update the CHANGELOG to every part of the
  project
- Added information about how to make a pull request to every part of the
  project

### Changed

- Updated `settings.json` to format document on save using `editor.formatOnSave`
  setting
- Updated `settings.json` to exclude certain files from markdown to PDF
  generation using `markdown-pdf.convertOnSaveExclude` setting
- Updated `settings.json` to use latest `java.cleanup.actions` setting
- Updated `settings.json` to automatically choose line endings using `files.eol`
  setting
- Updated `settings.json` to organize imports automatically on save using the
  `editor.codeActionsOnSave` and `source.organizeImports` settings
- Changed the component brainstorming assignment to ask a few clarifying
  questions
- Changed the component brainstorming example from `Point3D` to `NaturalNumber`
  to avoid the getter/setter trend
- Updated assignment feedback sections to include a link to a survey that
  I'll actually review
- Updated README to include step about using template repo
- Updated part 3 rubric to include a hierarchy diagram
- Updated part 6 rubric to account for overall polish

### Fixed

- Fixed issue where checkstyle paths would not work on MacOS

### Removed

- Removed `java.saveActions.organizeImports` setting from `settings.json`
- Removed references to `Point3D` completely

## [2024.01.07]

### Added

- Added a list of extensions to capture the ideal student experience
- Added PDFs to the `.gitignore`
- Added the OSU checkstyle config file
- Added the OSU formatter config file
- Added a `settings.json` file to customize the student experience
- Created a README at the root to explain how to use the template repo
- Created initial drafts of the six portfolio assessments
- Added READMEs to key folders like `test` and `lib` to explain their purpose

## 2024.09.15

### Added

- Designed a Matrix component
- Designed a Playlist component
- Designed a PlayableCharacter component

 2024.09.15.

## 2024.10.6

### Changed

- Updated the design of my Matrix component to have layering
- Updated the design of my Playlist component to have layering
- Updated the design of my PlayableCharacter component to have layering

## 2024.10.28

### Added

- In Src Folder I added a java file with custom component MusicPlaylist
- Implemented AddSong, removeNextSong, numberOfSongs (all kerenel)
- Implemented PrintSongs (secondary method), using the three kernel methods
- tested the methods in the main method and printed out results

2024.10.28.

## 2024.11.16

### Added

- Designed kernel and enhanced interfaces for MusicPlaylist
component

### Updated

- Changed design to include more secondary methods. Such as loop, addPlaylist, nextSong and keeping shuffle and printPlaylist from original design.

2024.11.16.

## 2024.11.17

### Added

- Designed abstract class for MusicPlaylist component
- implemented methods including nextSong, addPlaylist, loop, shuffle, toString, and equals

### Updated

- Changed design to include toString() in place of printPlaylist in orginal design (MusicPlaylist interface) and implemented all other methods in the interface and equals(). For hashCode I put a Reporter.fatalError to tell the client that the component doesn't support this method.

### Changed

- I changed the interface/ java doc comment for the shuffle method in my MusicPlaylist interface. I added the requirement that the size of the Playlist is greater than 3.

2024.11.17.

## 2024.11.20

### Added

- Designed kernel implementation for MusicPlaylist component

2024.11.20.

## 2024.12.04

### Added

- Designed test suite for MusicPlaylist component for kernel and standard

2024.12.04.

## 2024.12.05

### Added

- Designed two different use cases for MusicPlaylist component

### Updated

- Changed design to not include HashCode and Equals

2024.12.05.

[unreleased]: https://github.com/jrg94/portfolio-project/compare/v2024.08.07...HEAD
[2024.08.07]: https://github.com/jrg94/portfolio-project/compare/v2024.01.07...v2024.08.07
[2024.01.07]: https://github.com/jrg94/portfolio-project/releases/tag/v2024.01.07
