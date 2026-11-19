; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::~codecvt @ 00c0a92c
00c0a92c	paciasp
00c0a930	stp x29,x30,[sp, #-0x30]!
00c0a934	str x21,[sp, #0x10]
00c0a938	stp x20,x19,[sp, #0x20]
00c0a93c	mov x29,sp
00c0a940	adrp x8,0xcb5000
00c0a944	mov x19,x0
00c0a948	adrp x21,0xd27000
00c0a94c	ldr x8,[x8, #0xe30]
00c0a950	ldr x20,[x0, #0x10]
00c0a954	add x8,x8,#0x10
00c0a958	str x8,[x0]
00c0a95c	adrp x8,0xd27000
00c0a960	add x8,x8,#0xf8
00c0a964	ldarb w8,[x8]
00c0a968	tbz w8,#0x0,0x00c0a998
00c0a96c	ldr x8,[x21, #0xf0]
00c0a970	cmp x20,x8
00c0a974	b.eq 0x00c0a980
00c0a978	ldr x0,[x19, #0x10]
00c0a97c	bl 0x00c43980
00c0a980	mov x0,x19
00c0a984	ldp x20,x19,[sp, #0x20]
00c0a988	ldr x21,[sp, #0x10]
00c0a98c	ldp x29,x30,[sp], #0x30
00c0a990	autiasp
00c0a994	b 0x00c31530
00c0a998	adrp x0,0xd27000
00c0a99c	add x0,x0,#0xf8
00c0a9a0	bl 0x00c2fe90
00c0a9a4	cbz w0,0x00c0a96c
00c0a9a8	adrp x1,0x2c6000
00c0a9ac	add x1,x1,#0xbfc
00c0a9b0	mov w0,#0x1fbf
00c0a9b4	mov x2,xzr
00c0a9b8	bl 0x00c43890
00c0a9bc	str x0,[x21, #0xf0]
00c0a9c0	adrp x0,0xd27000
00c0a9c4	add x0,x0,#0xf8
00c0a9c8	bl 0x00c2fea0
00c0a9cc	b 0x00c0a96c
