; FUN_0084fea8 @ 0084fea8
0084fea8	stp x29,x30,[sp, #-0x30]!
0084feac	stp x22,x21,[sp, #0x10]
0084feb0	stp x20,x19,[sp, #0x20]
0084feb4	mov x29,sp
0084feb8	ldr x8,[x1]
0084febc	mov x20,x0
0084fec0	mov x19,x1
0084fec4	mov x0,x1
0084fec8	mov x1,x20
0084fecc	ldr x8,[x8, #0x120]
0084fed0	blr x8
0084fed4	tbz w0,#0x0,0x0084ff44
0084fed8	ldr x8,[x20, #0x28]
0084fedc	cbz x8,0x0084ff18
0084fee0	ldr x21,[x20, #0x20]
0084fee4	lsl x22,x8,#0x3
0084fee8	b 0x0084fef8
0084feec	subs x22,x22,#0x8
0084fef0	add x21,x21,#0x8
0084fef4	b.eq 0x0084ff18
0084fef8	ldr x8,[x21]
0084fefc	ldr x0,[x8, #0x38]
0084ff00	cbz x0,0x0084feec
0084ff04	ldr x8,[x0]
0084ff08	mov x1,x19
0084ff0c	ldr x8,[x8]
0084ff10	blr x8
0084ff14	b 0x0084feec
0084ff18	ldr x8,[x20, #0x38]
0084ff1c	cbz x8,0x0084ff44
0084ff20	ldr x20,[x20, #0x30]
0084ff24	lsl x21,x8,#0x3
0084ff28	ldr x0,[x20], #0x8
0084ff2c	mov x1,x19
0084ff30	ldr x8,[x0]
0084ff34	ldr x8,[x8]
0084ff38	blr x8
0084ff3c	subs x21,x21,#0x8
0084ff40	b.ne 0x0084ff28
0084ff44	ldp x20,x19,[sp, #0x20]
0084ff48	ldp x22,x21,[sp, #0x10]
0084ff4c	ldp x29,x30,[sp], #0x30
0084ff50	ret
