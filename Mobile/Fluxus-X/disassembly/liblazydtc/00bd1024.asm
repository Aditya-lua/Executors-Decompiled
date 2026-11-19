; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::sentry @ 00bd1024
00bd1024	bti c
00bd1028	ldr x8,[x1]
00bd102c	strb wzr,[x0]
00bd1030	str x1,[x0, #0x8]
00bd1034	ldur x8,[x8, #-0x18]
00bd1038	add x8,x1,x8
00bd103c	ldr w9,[x8, #0x20]
00bd1040	cbz w9,0x00bd1048
00bd1044	ret
00bd1048	ldr x8,[x8, #0x88]
00bd104c	cbz x8,0x00bd107c
00bd1050	paciasp
00bd1054	stp x29,x30,[sp, #-0x20]!
00bd1058	str x19,[sp, #0x10]
00bd105c	mov x29,sp
00bd1060	mov x19,x0
00bd1064	mov x0,x8
00bd1068	bl 0x00c30e50
00bd106c	mov x0,x19
00bd1070	ldr x19,[sp, #0x10]
00bd1074	ldp x29,x30,[sp], #0x20
00bd1078	autiasp
00bd107c	mov w8,#0x1
00bd1080	strb w8,[x0]
00bd1084	ret
