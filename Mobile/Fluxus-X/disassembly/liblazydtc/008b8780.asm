; FUN_008b8780 @ 008b8780
008b8780	adrp x8,0xd1f000
008b8784	ldrb w9,[x8, #0x618]
008b8788	ldpsw x10,x8,[x0, #0x20]
008b878c	cmp w9,#0x1
008b8790	b.ne 0x008b87a8
008b8794	ldr w9,[x0, #0x38]
008b8798	cmp w9,#0x1
008b879c	b.ne 0x008b87a8
008b87a0	ldr x9,[x0, #0x40]
008b87a4	b 0x008b87ac
008b87a8	add x9,x0,#0x40
008b87ac	sub x10,x10,#0x40
008b87b0	udiv x10,x10,x8
008b87b4	ldp w11,w12,[x0, #0x30]
008b87b8	sxtw x11,w11
008b87bc	str w12,[x3]
008b87c0	add x11,x9,x11
008b87c4	mul w10,w8,w10
008b87c8	add x8,x11,x8
008b87cc	str x8,[x1]
008b87d0	add x9,x9,w10, SXTW 
008b87d4	ldr w10,[x0, #0x24]
008b87d8	str x9,[x2]
008b87dc	str w10,[x4]
008b87e0	ret
