; FUN_008aa994 @ 008aa994
008aa994	sub sp,sp,#0x40
008aa998	stp x29,x30,[sp, #0x10]
008aa99c	stp x22,x21,[sp, #0x20]
008aa9a0	stp x20,x19,[sp, #0x30]
008aa9a4	add x29,sp,#0x10
008aa9a8	mrs x21,tpidr_el0
008aa9ac	mov w19,w1
008aa9b0	ldr x8,[x21, #0x28]
008aa9b4	str x8,[sp, #0x8]
008aa9b8	ldr x8,[x0, #0x68]
008aa9bc	tbnz w1,#0x1f,0x008aaa9c
008aa9c0	ldr x9,[x0, #0x70]
008aa9c4	sxtw x10,w19
008aa9c8	sub x11,x8,x9
008aa9cc	lsr x9,x11,#0x4
008aa9d0	sub x22,x10,w9, SXTW 
008aa9d4	ldr x9,[x0, #0x50]
008aa9d8	add x12,x8,x22, LSL #0x4
008aa9dc	ldr x10,[x9, #0x18]
008aa9e0	cmp x12,x10
008aa9e4	b.ls 0x008aaa60
008aa9e8	mov w12,#0x1f40
008aa9ec	cmp w22,w12
008aa9f0	b.gt 0x008aab14
008aa9f4	add x11,x22,x11, ASR #0x4
008aa9f8	mov w12,#0x1f40
008aa9fc	cmp x11,x12
008aaa00	b.gt 0x008aab14
008aaa04	cmp w22,#0x1
008aaa08	b.lt 0x008aaa60
008aaa0c	ldr x11,[x0, #0x48]
008aaa10	lsl w12,w22,#0x4
008aaa14	sub x11,x11,x8
008aaa18	cmp x11,x12
008aaa1c	b.gt 0x008aaa50
008aaa20	nop
008aaa24	adr x1,0x8aa604
008aaa28	add x2,sp,#0x4
008aaa2c	str w22,[sp, #0x4]
008aaa30	mov x20,x0
008aaa34	bl 0x008b3edc
008aaa38	mov w8,w0
008aaa3c	mov x0,x20
008aaa40	cbnz w8,0x008aab14
008aaa44	ldr x9,[x0, #0x50]
008aaa48	ldr x8,[x0, #0x68]
008aaa4c	ldr x10,[x9, #0x18]
008aaa50	add x11,x8,x22, LSL #0x4
008aaa54	cmp x10,x11
008aaa58	b.cs 0x008aaa60
008aaa5c	str x11,[x9, #0x18]
008aaa60	ldr x10,[x0, #0x70]
008aaa64	add x9,x10,w19, UXTW  #0x4
008aaa68	cmp x8,x9
008aaa6c	b.cs 0x008aaaec
008aaa70	mov w11,w19
008aaa74	add x10,x10,x11, LSL #0x4
008aaa78	add x11,x8,#0x10
008aaa7c	cmp x10,x11
008aaa80	csel x10,x10,x11,hi
008aaa84	mvn x11,x8
008aaa88	add x10,x10,x11
008aaa8c	cmp x10,#0x10
008aaa90	b.cs 0x008aaaa8
008aaa94	mov x10,x8
008aaa98	b 0x008aaad8
008aaa9c	add x8,x8,w19, SXTW  #0x4
008aaaa0	add x9,x8,#0x10
008aaaa4	b 0x008aaaec
008aaaa8	lsr x10,x10,#0x4
008aaaac	add x11,x10,#0x1
008aaab0	and x12,x11,#0x1ffffffffffffffe
008aaab4	add x10,x8,x12, LSL #0x4
008aaab8	add x8,x8,#0x1c
008aaabc	mov x13,x12
008aaac0	subs x13,x13,#0x2
008aaac4	stur wzr,[x8, #-0x10]
008aaac8	str wzr,[x8], #0x20
008aaacc	b.ne 0x008aaac0
008aaad0	cmp x11,x12
008aaad4	b.eq 0x008aaaec
008aaad8	add x8,x10,#0x10
008aaadc	str wzr,[x10, #0xc]
008aaae0	cmp x8,x9
008aaae4	mov x10,x8
008aaae8	b.cc 0x008aaad8
008aaaec	str x9,[x0, #0x68]
008aaaf0	ldr x8,[x21, #0x28]
008aaaf4	ldr x9,[sp, #0x8]
008aaaf8	cmp x8,x9
008aaafc	b.ne 0x008aab3c
008aab00	ldp x20,x19,[sp, #0x30]
008aab04	ldp x22,x21,[sp, #0x20]
008aab08	ldp x29,x30,[sp, #0x10]
008aab0c	add sp,sp,#0x40
008aab10	ret
008aab14	adrp x1,0x2b6000
008aab18	add x1,x1,#0xc71
008aab1c	mov x19,x0
008aab20	bl 0x008b9568
008aab24	ldr x8,[x21, #0x28]
008aab28	ldr x9,[sp, #0x8]
008aab2c	cmp x8,x9
008aab30	b.ne 0x008aab3c
008aab34	mov x0,x19
008aab38	bl 0x008aa5f4
008aab3c	bl 0x00c2fec0
