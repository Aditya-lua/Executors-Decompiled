; FUN_008ac024 @ 008ac024
008ac024	sub sp,sp,#0x40
008ac028	stp x29,x30,[sp, #0x20]
008ac02c	stp x20,x19,[sp, #0x30]
008ac030	add x29,sp,#0x20
008ac034	mrs x20,tpidr_el0
008ac038	ldr x8,[x20, #0x28]
008ac03c	stur x8,[x29, #-0x8]
008ac040	ldr x9,[x0, #0x50]
008ac044	ldr x8,[x0, #0x68]
008ac048	ldr x10,[x9, #0x18]
008ac04c	add x11,x8,#0x10
008ac050	cmp x11,x10
008ac054	b.ls 0x008ac0c4
008ac058	ldr x11,[x0, #0x70]
008ac05c	mov w12,#0xf3f0
008ac060	movk w12,#0x1, LSL #16
008ac064	sub x11,x8,x11
008ac068	cmp x11,x12
008ac06c	b.gt 0x008ac0f0
008ac070	ldr x11,[x0, #0x48]
008ac074	sub x11,x11,x8
008ac078	cmp x11,#0x10
008ac07c	b.gt 0x008ac0b4
008ac080	mov w8,#0x1
008ac084	nop
008ac088	adr x1,0x8aa604
008ac08c	sub x2,x29,#0xc
008ac090	stur w8,[x29, #-0xc]
008ac094	mov x19,x0
008ac098	bl 0x008b3edc
008ac09c	mov w8,w0
008ac0a0	mov x0,x19
008ac0a4	cbnz w8,0x008ac0f0
008ac0a8	ldr x9,[x0, #0x50]
008ac0ac	ldr x8,[x0, #0x68]
008ac0b0	ldr x10,[x9, #0x18]
008ac0b4	add x11,x8,#0x10
008ac0b8	cmp x10,x11
008ac0bc	b.cs 0x008ac0c4
008ac0c0	str x11,[x9, #0x18]
008ac0c4	str wzr,[x8, #0xc]
008ac0c8	add x8,x8,#0x10
008ac0cc	str x8,[x0, #0x68]
008ac0d0	ldr x8,[x20, #0x28]
008ac0d4	ldur x9,[x29, #-0x8]
008ac0d8	cmp x8,x9
008ac0dc	b.ne 0x008ac118
008ac0e0	ldp x20,x19,[sp, #0x30]
008ac0e4	ldp x29,x30,[sp, #0x20]
008ac0e8	add sp,sp,#0x40
008ac0ec	ret
008ac0f0	adrp x1,0x2b6000
008ac0f4	add x1,x1,#0xc71
008ac0f8	str x0,[sp, #0x8]
008ac0fc	bl 0x008b9568
008ac100	ldr x8,[x20, #0x28]
008ac104	ldur x9,[x29, #-0x8]
008ac108	cmp x8,x9
008ac10c	b.ne 0x008ac118
008ac110	ldr x0,[sp, #0x8]
008ac114	bl 0x008aa5f4
008ac118	bl 0x00c2fec0
