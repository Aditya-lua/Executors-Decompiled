; FUN_008adea0 @ 008adea0
008adea0	sub sp,sp,#0x60
008adea4	stp x29,x30,[sp, #0x20]
008adea8	stp x24,x23,[sp, #0x30]
008adeac	stp x22,x21,[sp, #0x40]
008adeb0	stp x20,x19,[sp, #0x50]
008adeb4	add x29,sp,#0x20
008adeb8	mrs x21,tpidr_el0
008adebc	add w9,w1,#0x1
008adec0	mov w20,w2
008adec4	ldr x8,[x21, #0x28]
008adec8	mov x19,x0
008adecc	subs w11,w2,w9
008aded0	stur x8,[x29, #-0x8]
008aded4	b.le 0x008adf78
008aded8	ldr x9,[x19, #0x68]
008adedc	ldr x8,[x19, #0x50]
008adee0	add x12,x9,w11, SXTW  #0x4
008adee4	ldr x10,[x8, #0x18]
008adee8	cmp x12,x10
008adeec	b.ls 0x008adf78
008adef0	mov w12,#0x1f40
008adef4	cmp w11,w12
008adef8	b.gt 0x008ae070
008adefc	ldr x12,[x19, #0x70]
008adf00	sxtw x22,w11
008adf04	mov w13,#0x1f40
008adf08	sub x12,x9,x12
008adf0c	add x12,x22,x12, ASR #0x4
008adf10	cmp x12,x13
008adf14	b.gt 0x008ae070
008adf18	ldr x12,[x19, #0x48]
008adf1c	lsl w13,w11,#0x4
008adf20	sub x12,x12,x9
008adf24	cmp x12,x13
008adf28	b.gt 0x008adf68
008adf2c	nop
008adf30	adr x8,0x8aa604
008adf34	add x2,sp,#0x8
008adf38	mov x0,x19
008adf3c	mov w23,w1
008adf40	mov x1,x8
008adf44	str w11,[sp, #0x8]
008adf48	mov w24,w3
008adf4c	bl 0x008b3edc
008adf50	cbnz w0,0x008ae070
008adf54	ldr x8,[x19, #0x50]
008adf58	ldr x9,[x19, #0x68]
008adf5c	mov w3,w24
008adf60	mov w1,w23
008adf64	ldr x10,[x8, #0x18]
008adf68	add x9,x9,x22, LSL #0x4
008adf6c	cmp x10,x9
008adf70	b.cs 0x008adf78
008adf74	str x9,[x8, #0x18]
008adf78	cbz w3,0x008adfbc
008adf7c	cmp w3,#0x1
008adf80	b.lt 0x008adfc8
008adf84	ldp x9,x8,[x19, #0x68]
008adf88	add x8,x8,w3, UXTW  #0x4
008adf8c	sub x0,x8,#0x10
008adf90	cmp x0,x9
008adf94	b.cc 0x008adff4
008adf98	adrp x8,0xd1f000
008adf9c	add x8,x8,#0x1e0
008adfa0	adrp x22,0xd1f000
008adfa4	ldarb w8,[x8]
008adfa8	tbz w8,#0x0,0x008ae098
008adfac	ldr x8,[x22, #0x1d8]
008adfb0	add x8,x8,#0x7f2, LSL #12
008adfb4	add x0,x8,#0xef0
008adfb8	b 0x008adff4
008adfbc	ldr x8,[x19, #0x58]
008adfc0	mov x4,xzr
008adfc4	b 0x008adffc
008adfc8	mov w8,#0xffffd8f1
008adfcc	cmp w3,w8
008adfd0	b.cc 0x008adfe0
008adfd4	ldr x8,[x19, #0x68]
008adfd8	add x0,x8,w3, SXTW  #0x4
008adfdc	b 0x008adff4
008adfe0	mov x0,x19
008adfe4	mov w22,w1
008adfe8	mov w1,w3
008adfec	bl 0x008aea7c
008adff0	mov w1,w22
008adff4	ldr x8,[x19, #0x58]
008adff8	sub x4,x0,x8
008adffc	ldr x9,[x19, #0x68]
008ae000	mvn w10,w1
008ae004	nop
008ae008	adr x1,0x8ae100
008ae00c	add x2,sp,#0x8
008ae010	mov x0,x19
008ae014	add x9,x9,w10, SXTW  #0x4
008ae018	str w20,[sp, #0x10]
008ae01c	sub x3,x9,x8
008ae020	str x9,[sp, #0x8]
008ae024	bl 0x008b47f0
008ae028	cmn w20,#0x1
008ae02c	b.ne 0x008ae048
008ae030	ldr x8,[x19, #0x50]
008ae034	ldr x9,[x19, #0x68]
008ae038	ldr x10,[x8, #0x18]
008ae03c	cmp x9,x10
008ae040	b.cc 0x008ae048
008ae044	str x9,[x8, #0x18]
008ae048	ldr x8,[x21, #0x28]
008ae04c	ldur x9,[x29, #-0x8]
008ae050	cmp x8,x9
008ae054	b.ne 0x008ae0fc
008ae058	ldp x20,x19,[sp, #0x50]
008ae05c	ldp x22,x21,[sp, #0x40]
008ae060	ldp x24,x23,[sp, #0x30]
008ae064	ldp x29,x30,[sp, #0x20]
008ae068	add sp,sp,#0x60
008ae06c	ret
008ae070	adrp x1,0x2b6000
008ae074	add x1,x1,#0xc71
008ae078	mov x0,x19
008ae07c	bl 0x008b9568
008ae080	ldr x8,[x21, #0x28]
008ae084	ldur x9,[x29, #-0x8]
008ae088	cmp x8,x9
008ae08c	b.ne 0x008ae0fc
008ae090	mov x0,x19
008ae094	bl 0x008aa5f4
008ae098	adrp x0,0xd1f000
008ae09c	add x0,x0,#0x1e0
008ae0a0	str w1,[sp, #0x4]
008ae0a4	bl 0x00c2fe90
008ae0a8	ldr w1,[sp, #0x4]
008ae0ac	cbz w0,0x008adfac
008ae0b0	adrp x8,0xcca000
008ae0b4	ldr x0,[x8, #0x8c8]
008ae0b8	bl 0x007fe1ec
008ae0bc	str x0,[x22, #0x1d8]
008ae0c0	adrp x0,0xd1f000
008ae0c4	add x0,x0,#0x1e0
008ae0c8	bl 0x00c2fea0
008ae0cc	ldr w1,[sp, #0x4]
008ae0d0	b 0x008adfac
008ae0fc	bl 0x00c2fec0
