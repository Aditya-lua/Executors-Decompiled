; FUN_00a3d8b0 @ 00a3d8b0
00a3d8b0	sub sp,sp,#0x40
00a3d8b4	stp x22,x21,[sp, #0x10]
00a3d8b8	stp x20,x19,[sp, #0x20]
00a3d8bc	stp x29,x30,[sp, #0x30]
00a3d8c0	add x29,sp,#0x30
00a3d8c4	mov x20,x4
00a3d8c8	mov x21,x3
00a3d8cc	mov x19,x2
00a3d8d0	mov x22,x1
00a3d8d4	bl 0x00c36dc0
00a3d8d8	ldr x0,[x0, #0x88]
00a3d8dc	bl 0x00c3b2e0
00a3d8e0	cbz x0,0x00a3d91c
00a3d8e4	cbz x22,0x00a3d980
00a3d8e8	ldr x8,[x19]
00a3d8ec	cmp x8,#0x71
00a3d8f0	b.hi 0x00a3d950
00a3d8f4	bl 0x00c342a0
00a3d8f8	adrp x0,0x2aa000
00a3d8fc	adrp x2,0x2b7000
00a3d900	add x0,x0,#0x129
00a3d904	add x2,x2,#0xb28
00a3d908	mov w1,#0x350
00a3d90c	bl 0x00c342b0
00a3d910	mov w0,#0x10
00a3d914	mov w1,#0x64
00a3d918	b 0x00a3d940
00a3d91c	bl 0x00c342a0
00a3d920	adrp x0,0x2aa000
00a3d924	adrp x2,0x2b7000
00a3d928	add x0,x0,#0x129
00a3d92c	add x2,x2,#0xb28
00a3d930	mov w1,#0x347
00a3d934	bl 0x00c342b0
00a3d938	mov w0,#0x10
00a3d93c	mov w1,#0x74
00a3d940	mov x2,xzr
00a3d944	bl 0x00c342c0
00a3d948	mov w0,wzr
00a3d94c	b 0x00a3d98c
00a3d950	ldp x8,x9,[x0]
00a3d954	ldr x5,[x0, #0x50]
00a3d958	add x4,x0,#0x11
00a3d95c	mov x1,x22
00a3d960	mov x0,x8
00a3d964	mov x2,x21
00a3d968	mov x3,x20
00a3d96c	mov x6,xzr
00a3d970	mov x7,xzr
00a3d974	str x9,[sp]
00a3d978	bl 0x00c3a570
00a3d97c	cbz w0,0x00a3d98c
00a3d980	mov w8,#0x72
00a3d984	mov w0,#0x1
00a3d988	str x8,[x19]
00a3d98c	ldp x29,x30,[sp, #0x30]
00a3d990	ldp x20,x19,[sp, #0x20]
00a3d994	ldp x22,x21,[sp, #0x10]
00a3d998	add sp,sp,#0x40
00a3d99c	ret
