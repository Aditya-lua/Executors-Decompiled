; FUN_008aa520 @ 008aa520
008aa520	sub sp,sp,#0x40
008aa524	stp x29,x30,[sp, #0x10]
008aa528	str x21,[sp, #0x20]
008aa52c	stp x20,x19,[sp, #0x30]
008aa530	add x29,sp,#0x10
008aa534	mrs x19,tpidr_el0
008aa538	mov w9,#0x1f40
008aa53c	ldr x8,[x19, #0x28]
008aa540	cmp w1,w9
008aa544	str x8,[sp, #0x8]
008aa548	b.gt 0x008aa568
008aa54c	ldp x8,x9,[x0, #0x68]
008aa550	sxtw x20,w1
008aa554	mov w10,#0x1f40
008aa558	sub x9,x8,x9
008aa55c	add x9,x20,x9, ASR #0x4
008aa560	cmp x9,x10
008aa564	b.le 0x008aa570
008aa568	mov w0,wzr
008aa56c	b 0x008aa5cc
008aa570	cmp w1,#0x1
008aa574	b.lt 0x008aa5c8
008aa578	ldr x9,[x0, #0x48]
008aa57c	lsl w10,w1,#0x4
008aa580	sub x9,x9,x8
008aa584	cmp x9,x10
008aa588	b.gt 0x008aa5b0
008aa58c	str w1,[sp, #0x4]
008aa590	nop
008aa594	adr x1,0x8aa604
008aa598	add x2,sp,#0x4
008aa59c	mov x21,x0
008aa5a0	bl 0x008b3edc
008aa5a4	cbnz w0,0x008aa568
008aa5a8	ldr x8,[x21, #0x68]
008aa5ac	mov x0,x21
008aa5b0	ldr x9,[x0, #0x50]
008aa5b4	add x8,x8,x20, LSL #0x4
008aa5b8	ldr x10,[x9, #0x18]
008aa5bc	cmp x10,x8
008aa5c0	b.cs 0x008aa5c8
008aa5c4	str x8,[x9, #0x18]
008aa5c8	mov w0,#0x1
008aa5cc	ldr x8,[x19, #0x28]
008aa5d0	ldr x9,[sp, #0x8]
008aa5d4	cmp x8,x9
008aa5d8	b.ne 0x008aa5f0
008aa5dc	ldp x20,x19,[sp, #0x30]
008aa5e0	ldr x21,[sp, #0x20]
008aa5e4	ldp x29,x30,[sp, #0x10]
008aa5e8	add sp,sp,#0x40
008aa5ec	ret
008aa5f0	bl 0x00c2fec0
