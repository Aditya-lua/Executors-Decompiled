; FUN_00a3d148 @ 00a3d148
00a3d148	stp x20,x19,[sp, #-0x20]!
00a3d14c	mov w0,#0x440
00a3d150	stp x29,x30,[sp, #0x10]
00a3d154	add x29,sp,#0x10
00a3d158	mov x19,x4
00a3d15c	mov x20,x3
00a3d160	bl 0x00c37740
00a3d164	mov x1,x0
00a3d168	mov w2,#0xffffffff
00a3d16c	mov x0,x20
00a3d170	mov x3,xzr
00a3d174	bl 0x00c37ee0
00a3d178	cbz x19,0x00a3d198
00a3d17c	mov w0,#0x440
00a3d180	bl 0x00c37740
00a3d184	mov x1,x0
00a3d188	mov w2,#0xffffffff
00a3d18c	mov x0,x19
00a3d190	mov x3,xzr
00a3d194	bl 0x00c37ee0
00a3d198	ldp x29,x30,[sp, #0x10]
00a3d19c	orr w0,wzr,#0x3
00a3d1a0	ldp x20,x19,[sp], #0x20
00a3d1a4	ret
