; FUN_00850aa4 @ 00850aa4
00850aa4	stp x29,x30,[sp, #-0x30]!
00850aa8	stp x22,x21,[sp, #0x10]
00850aac	stp x20,x19,[sp, #0x20]
00850ab0	mov x29,sp
00850ab4	ldr x8,[x1]
00850ab8	mov x20,x0
00850abc	mov x19,x1
00850ac0	mov x0,x1
00850ac4	mov x1,x20
00850ac8	ldr x8,[x8, #0x188]
00850acc	blr x8
00850ad0	tbz w0,#0x0,0x00850b2c
00850ad4	ldr x8,[x20, #0x28]
00850ad8	cbz x8,0x00850b00
00850adc	ldr x21,[x20, #0x20]
00850ae0	lsl x22,x8,#0x3
00850ae4	ldr x0,[x21], #0x8
00850ae8	mov x1,x19
00850aec	ldr x8,[x0]
00850af0	ldr x8,[x8]
00850af4	blr x8
00850af8	subs x22,x22,#0x8
00850afc	b.ne 0x00850ae4
00850b00	ldr x8,[x20, #0x38]
00850b04	cbz x8,0x00850b2c
00850b08	ldr x20,[x20, #0x30]
00850b0c	lsl x21,x8,#0x3
00850b10	ldr x0,[x20], #0x8
00850b14	mov x1,x19
00850b18	ldr x8,[x0]
00850b1c	ldr x8,[x8]
00850b20	blr x8
00850b24	subs x21,x21,#0x8
00850b28	b.ne 0x00850b10
00850b2c	ldp x20,x19,[sp, #0x20]
00850b30	ldp x22,x21,[sp, #0x10]
00850b34	ldp x29,x30,[sp], #0x30
00850b38	ret
