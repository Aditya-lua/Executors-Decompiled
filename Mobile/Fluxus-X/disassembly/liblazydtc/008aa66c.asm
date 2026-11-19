; FUN_008aa66c @ 008aa66c
008aa66c	sub sp,sp,#0x50
008aa670	stp x29,x30,[sp, #0x10]
008aa674	str x23,[sp, #0x20]
008aa678	stp x22,x21,[sp, #0x30]
008aa67c	stp x20,x19,[sp, #0x40]
008aa680	add x29,sp,#0x10
008aa684	mrs x22,tpidr_el0
008aa688	ldr x8,[x22, #0x28]
008aa68c	cmp x0,x1
008aa690	str x8,[sp, #0x8]
008aa694	b.eq 0x008aa7a0
008aa698	ldrb w8,[x1, #0x2]
008aa69c	mov w21,w2
008aa6a0	mov x20,x1
008aa6a4	mov x19,x0
008aa6a8	tbz w8,#0x2,0x008aa6bc
008aa6ac	add x2,x20,#0x38
008aa6b0	mov x0,x20
008aa6b4	mov x1,x20
008aa6b8	bl 0x008b63a4
008aa6bc	ldr x8,[x20, #0x68]
008aa6c0	ldr x9,[x20, #0x50]
008aa6c4	sxtw x23,w21
008aa6c8	add x11,x8,w21, SXTW  #0x4
008aa6cc	ldr x10,[x9, #0x18]
008aa6d0	cmp x11,x10
008aa6d4	b.ls 0x008aa75c
008aa6d8	mov w11,#0x1f40
008aa6dc	cmp w21,w11
008aa6e0	b.gt 0x008aa7c8
008aa6e4	ldr x11,[x20, #0x70]
008aa6e8	mov w12,#0x1f40
008aa6ec	sub x11,x8,x11
008aa6f0	add x11,x23,x11, ASR #0x4
008aa6f4	cmp x11,x12
008aa6f8	b.gt 0x008aa7c8
008aa6fc	cmp w21,#0x0
008aa700	b.le 0x008aa78c
008aa704	ldr x11,[x20, #0x48]
008aa708	lsl w12,w21,#0x4
008aa70c	sub x11,x11,x8
008aa710	cmp x11,x12
008aa714	b.gt 0x008aa740
008aa718	nop
008aa71c	adr x1,0x8aa604
008aa720	add x2,sp,#0x4
008aa724	mov x0,x20
008aa728	str w21,[sp, #0x4]
008aa72c	bl 0x008b3edc
008aa730	cbnz w0,0x008aa7c8
008aa734	ldr x9,[x20, #0x50]
008aa738	ldr x8,[x20, #0x68]
008aa73c	ldr x10,[x9, #0x18]
008aa740	add x11,x8,x23, LSL #0x4
008aa744	cmp x10,x11
008aa748	b.cs 0x008aa750
008aa74c	str x11,[x9, #0x18]
008aa750	ldr x9,[x19, #0x68]!
008aa754	sub x9,x9,x23, LSL #0x4
008aa758	b 0x008aa76c
008aa75c	ldr x9,[x19, #0x68]!
008aa760	cmp w21,#0x1
008aa764	sub x9,x9,x23, LSL #0x4
008aa768	b.lt 0x008aa794
008aa76c	mov x10,xzr
008aa770	mov w11,w21
008aa774	ldr q0,[x9,x10]
008aa778	subs x11,x11,#0x1
008aa77c	str q0,[x8,x10]
008aa780	add x10,x10,#0x10
008aa784	b.ne 0x008aa774
008aa788	b 0x008aa794
008aa78c	ldr x9,[x19, #0x68]!
008aa790	sub x9,x9,x23, LSL #0x4
008aa794	add x8,x8,x23, LSL #0x4
008aa798	str x9,[x19]
008aa79c	str x8,[x20, #0x68]
008aa7a0	ldr x8,[x22, #0x28]
008aa7a4	ldr x9,[sp, #0x8]
008aa7a8	cmp x8,x9
008aa7ac	b.ne 0x008aa7f0
008aa7b0	ldp x20,x19,[sp, #0x40]
008aa7b4	ldr x23,[sp, #0x20]
008aa7b8	ldp x22,x21,[sp, #0x30]
008aa7bc	ldp x29,x30,[sp, #0x10]
008aa7c0	add sp,sp,#0x50
008aa7c4	ret
008aa7c8	adrp x1,0x2b6000
008aa7cc	add x1,x1,#0xc71
008aa7d0	mov x0,x19
008aa7d4	bl 0x008b9568
008aa7d8	ldr x8,[x22, #0x28]
008aa7dc	ldr x9,[sp, #0x8]
008aa7e0	cmp x8,x9
008aa7e4	b.ne 0x008aa7f0
008aa7e8	mov x0,x19
008aa7ec	bl 0x008aa5f4
008aa7f0	bl 0x00c2fec0
