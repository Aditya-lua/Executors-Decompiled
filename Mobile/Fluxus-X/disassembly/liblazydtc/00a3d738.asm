; FUN_00a3d738 @ 00a3d738
00a3d738	stp x22,x21,[sp, #-0x30]!
00a3d73c	stp x20,x19,[sp, #0x10]
00a3d740	stp x29,x30,[sp, #0x20]
00a3d744	add x29,sp,#0x20
00a3d748	mov x20,x4
00a3d74c	mov x21,x3
00a3d750	mov x19,x2
00a3d754	mov x22,x1
00a3d758	bl 0x00c36dc0
00a3d75c	ldr x0,[x0, #0x88]
00a3d760	bl 0x00c3b2e0
00a3d764	cbz x0,0x00a3d7a0
00a3d768	cbz x22,0x00a3d7f8
00a3d76c	ldr x8,[x19]
00a3d770	cmp x8,#0x3f
00a3d774	b.hi 0x00a3d7d4
00a3d778	bl 0x00c342a0
00a3d77c	adrp x0,0x2aa000
00a3d780	adrp x2,0x2bf000
00a3d784	add x0,x0,#0x129
00a3d788	add x2,x2,#0xbe0
00a3d78c	mov w1,#0x335
00a3d790	bl 0x00c342b0
00a3d794	mov w0,#0x10
00a3d798	mov w1,#0x64
00a3d79c	b 0x00a3d7c4
00a3d7a0	bl 0x00c342a0
00a3d7a4	adrp x0,0x2aa000
00a3d7a8	adrp x2,0x2bf000
00a3d7ac	add x0,x0,#0x129
00a3d7b0	add x2,x2,#0xbe0
00a3d7b4	mov w1,#0x32c
00a3d7b8	bl 0x00c342b0
00a3d7bc	mov w0,#0x10
00a3d7c0	mov w1,#0x74
00a3d7c4	mov x2,xzr
00a3d7c8	bl 0x00c342c0
00a3d7cc	mov w0,wzr
00a3d7d0	b 0x00a3d804
00a3d7d4	ldr x4,[x0, #0x50]
00a3d7d8	add x3,x0,#0x11
00a3d7dc	mov x0,x22
00a3d7e0	mov x1,x21
00a3d7e4	mov x2,x20
00a3d7e8	mov x5,xzr
00a3d7ec	mov x6,xzr
00a3d7f0	bl 0x00c3a680
00a3d7f4	cbz w0,0x00a3d804
00a3d7f8	mov w8,#0x40
00a3d7fc	mov w0,#0x1
00a3d800	str x8,[x19]
00a3d804	ldp x29,x30,[sp, #0x20]
00a3d808	ldp x20,x19,[sp, #0x10]
00a3d80c	ldp x22,x21,[sp], #0x30
00a3d810	ret
