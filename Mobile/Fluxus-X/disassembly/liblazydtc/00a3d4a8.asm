; FUN_00a3d4a8 @ 00a3d4a8
00a3d4a8	stp x20,x19,[sp, #-0x20]!
00a3d4ac	stp x29,x30,[sp, #0x10]
00a3d4b0	ldr x8,[x0, #0x78]
00a3d4b4	mov x20,x0
00a3d4b8	mov x19,x1
00a3d4bc	mov w4,#0x2
00a3d4c0	ldr w3,[x8]
00a3d4c4	mov x0,xzr
00a3d4c8	mov x1,xzr
00a3d4cc	mov w2,wzr
00a3d4d0	mov x5,xzr
00a3d4d4	mov x6,xzr
00a3d4d8	add x29,sp,#0x10
00a3d4dc	bl 0x00c3b250
00a3d4e0	cbz x0,0x00a3d4fc
00a3d4e4	ldr x8,[x20, #0x78]
00a3d4e8	mov x2,x0
00a3d4ec	mov x0,x19
00a3d4f0	ldr w1,[x8]
00a3d4f4	bl 0x00c39b70
00a3d4f8	mov w0,#0x1
00a3d4fc	ldp x29,x30,[sp, #0x10]
00a3d500	ldp x20,x19,[sp], #0x20
00a3d504	ret
