; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::getline @ 00bd49e8
00bd49e8	paciasp
00bd49ec	sub sp,sp,#0x40
00bd49f0	stp x29,x30,[sp, #0x10]
00bd49f4	stp x22,x21,[sp, #0x20]
00bd49f8	stp x20,x19,[sp, #0x30]
00bd49fc	add x29,sp,#0x10
00bd4a00	ldr x8,[x0]
00bd4a04	mov x20,x0
00bd4a08	mov x19,x2
00bd4a0c	mov x21,x1
00bd4a10	ldur x9,[x8, #-0x18]
00bd4a14	add x8,sp,#0x8
00bd4a18	add x0,x0,x9
00bd4a1c	bl 0x00c30070
00bd4a20	adrp x1,0xcb5000
00bd4a24	add x0,sp,#0x8
00bd4a28	ldr x1,[x1, #0xb98]
00bd4a2c	bl 0x00c30080
00bd4a30	ldr x8,[x0]
00bd4a34	ldr x8,[x8, #0x58]
00bd4a38	mov w1,#0xa
00bd4a3c	blr x8
00bd4a40	mov w22,w0
00bd4a44	add x0,sp,#0x8
00bd4a48	bl 0x00c30090
00bd4a4c	mov x0,x20
00bd4a50	mov x1,x21
00bd4a54	mov x2,x19
00bd4a58	mov w3,w22
00bd4a5c	bl 0x00c440a0
00bd4a60	ldp x20,x19,[sp, #0x30]
00bd4a64	ldp x22,x21,[sp, #0x20]
00bd4a68	ldp x29,x30,[sp, #0x10]
00bd4a6c	add sp,sp,#0x40
00bd4a70	autiasp
00bd4a74	ret
