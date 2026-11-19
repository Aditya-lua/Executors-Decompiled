; FUN_00857aac @ 00857aac
00857aac	stp x29,x30,[sp, #-0x30]!
00857ab0	stp x22,x21,[sp, #0x10]
00857ab4	stp x20,x19,[sp, #0x20]
00857ab8	mov x29,sp
00857abc	ldr x21,[x0]
00857ac0	cbz x21,0x00857b1c
00857ac4	ldr x8,[x0, #0x8]
00857ac8	mov x19,x0
00857acc	mov x0,x21
00857ad0	cmp x21,x8
00857ad4	b.eq 0x00857b00
00857ad8	sub x20,x8,#0x30
00857adc	mov x22,x20
00857ae0	ldr x8,[x22], #-0x30
00857ae4	mov x0,x20
00857ae8	ldr x8,[x8]
00857aec	blr x8
00857af0	cmp x20,x21
00857af4	mov x20,x22
00857af8	b.ne 0x00857ae0
00857afc	ldr x0,[x19]
00857b00	ldr x8,[x19, #0x10]
00857b04	str x21,[x19, #0x8]
00857b08	sub x1,x8,x0
00857b0c	ldp x20,x19,[sp, #0x20]
00857b10	ldp x22,x21,[sp, #0x10]
00857b14	ldp x29,x30,[sp], #0x30
00857b18	b 0x00c2fe80
00857b1c	ldp x20,x19,[sp, #0x20]
00857b20	ldp x22,x21,[sp, #0x10]
00857b24	ldp x29,x30,[sp], #0x30
00857b28	ret
