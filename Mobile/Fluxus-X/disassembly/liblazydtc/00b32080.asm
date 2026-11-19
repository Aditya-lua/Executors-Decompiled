; FUN_00b32080 @ 00b32080
00b32080	stp x22,x21,[sp, #-0x30]!
00b32084	stp x20,x19,[sp, #0x10]
00b32088	stp x29,x30,[sp, #0x20]
00b3208c	add x29,sp,#0x20
00b32090	mov x22,x3
00b32094	mov x19,x2
00b32098	mov x21,x1
00b3209c	mov x20,x0
00b320a0	bl 0x00c41000
00b320a4	mov w8,w0
00b320a8	cmp x22,#0x20
00b320ac	mov w0,wzr
00b320b0	b.cc 0x00b320d4
00b320b4	cbz w8,0x00b320d4
00b320b8	mov x0,x21
00b320bc	mov x1,x20
00b320c0	bl 0x00c3d5d0
00b320c4	cbz w0,0x00b320d4
00b320c8	mov w8,#0x20
00b320cc	mov w0,#0x1
00b320d0	str x8,[x19]
00b320d4	ldp x29,x30,[sp, #0x20]
00b320d8	ldp x20,x19,[sp, #0x10]
00b320dc	ldp x22,x21,[sp], #0x30
00b320e0	ret
