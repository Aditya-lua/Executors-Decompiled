; FUN_00906fc0 @ 00906fc0
00906fc0	stp x20,x19,[sp, #-0x20]!
00906fc4	stp x29,x30,[sp, #0x10]
00906fc8	add x29,sp,#0x10
00906fcc	ldr x8,[x0, #0x20]
00906fd0	mov x19,x0
00906fd4	mov w20,w1
00906fd8	add x8,x8,w1, SXTW  #0x3
00906fdc	ldr x0,[x8, #0x248]
00906fe0	cbz x0,0x00906ff4
00906fe4	ldr x8,[x0]
00906fe8	mov x1,x19
00906fec	ldr x8,[x8, #0x20]
00906ff0	blr x8
00906ff4	ldp x29,x30,[sp, #0x10]
00906ff8	mov x0,x19
00906ffc	mov w1,w20
00907000	ldp x20,x19,[sp], #0x20
00907004	b 0x009089bc
