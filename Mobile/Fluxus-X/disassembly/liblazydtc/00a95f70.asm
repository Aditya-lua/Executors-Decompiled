; FUN_00a95f70 @ 00a95f70
00a95f70	stp x26,x25,[sp, #-0x50]!
00a95f74	stp x24,x23,[sp, #0x10]
00a95f78	stp x22,x21,[sp, #0x20]
00a95f7c	stp x20,x19,[sp, #0x30]
00a95f80	stp x29,x30,[sp, #0x40]
00a95f84	add x29,sp,#0x40
00a95f88	mov x22,x3
00a95f8c	mov x19,x2
00a95f90	mov x20,x1
00a95f94	mov x21,x0
00a95f98	bl 0x00c34b80
00a95f9c	ldrsw x24,[x0, #0x4]
00a95fa0	cmp x24,x22
00a95fa4	b.hi 0x00a95fdc
00a95fa8	mov x25,xzr
00a95fac	sub x26,x22,x24
00a95fb0	mov x0,x21
00a95fb4	add x22,x19,x25
00a95fb8	add x23,x20,x25
00a95fbc	bl 0x00c3cea0
00a95fc0	mov x2,x0
00a95fc4	mov x0,x22
00a95fc8	mov x1,x23
00a95fcc	bl 0x00c3ddd0
00a95fd0	add x25,x25,x24
00a95fd4	cmp x25,x26
00a95fd8	b.ls 0x00a95fb0
00a95fdc	ldp x29,x30,[sp, #0x40]
00a95fe0	ldp x20,x19,[sp, #0x30]
00a95fe4	ldp x22,x21,[sp, #0x20]
00a95fe8	ldp x24,x23,[sp, #0x10]
00a95fec	mov w0,#0x1
00a95ff0	ldp x26,x25,[sp], #0x50
00a95ff4	ret
