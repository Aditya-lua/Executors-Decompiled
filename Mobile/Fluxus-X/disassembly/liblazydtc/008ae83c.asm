; FUN_008ae83c @ 008ae83c
008ae83c	sub sp,sp,#0x40
008ae840	stp x29,x30,[sp, #0x10]
008ae844	str x21,[sp, #0x20]
008ae848	stp x20,x19,[sp, #0x30]
008ae84c	add x29,sp,#0x10
008ae850	mrs x21,tpidr_el0
008ae854	mov x19,x0
008ae858	mov w20,w1
008ae85c	ldr x8,[x21, #0x28]
008ae860	str x8,[sp, #0x8]
008ae864	ldr x8,[x0, #0x60]
008ae868	ldp x8,x9,[x8, #0x8]
008ae86c	cmp x9,x8
008ae870	b.cc 0x008ae880
008ae874	mov x0,x19
008ae878	mov w1,#0x1
008ae87c	bl 0x008b52c4
008ae880	ldrb w8,[x19, #0x2]
008ae884	tbz w8,#0x2,0x008ae898
008ae888	add x2,x19,#0x38
008ae88c	mov x0,x19
008ae890	mov x1,x19
008ae894	bl 0x008b63a4
008ae898	ldr x9,[x19, #0x50]
008ae89c	ldr x8,[x19, #0x68]
008ae8a0	ldr x10,[x9, #0x18]
008ae8a4	add x11,x8,#0x10
008ae8a8	cmp x11,x10
008ae8ac	b.ls 0x008ae914
008ae8b0	ldr x11,[x19, #0x70]
008ae8b4	mov w12,#0xf3f0
008ae8b8	movk w12,#0x1, LSL #16
008ae8bc	sub x11,x8,x11
008ae8c0	cmp x11,x12
008ae8c4	b.gt 0x008ae9f8
008ae8c8	ldr x11,[x19, #0x48]
008ae8cc	sub x11,x11,x8
008ae8d0	cmp x11,#0x10
008ae8d4	b.gt 0x008ae904
008ae8d8	mov w8,#0x1
008ae8dc	nop
008ae8e0	adr x1,0x8aa604
008ae8e4	add x2,sp,#0x4
008ae8e8	mov x0,x19
008ae8ec	str w8,[sp, #0x4]
008ae8f0	bl 0x008b3edc
008ae8f4	cbnz w0,0x008ae9f8
008ae8f8	ldr x9,[x19, #0x50]
008ae8fc	ldr x8,[x19, #0x68]
008ae900	ldr x10,[x9, #0x18]
008ae904	add x11,x8,#0x10
008ae908	cmp x10,x11
008ae90c	b.cs 0x008ae914
008ae910	str x11,[x9, #0x18]
008ae914	cmp w20,#0x1
008ae918	b.lt 0x008ae954
008ae91c	ldr x9,[x19, #0x70]
008ae920	add x9,x9,w20, UXTW  #0x4
008ae924	sub x0,x9,#0x10
008ae928	cmp x0,x8
008ae92c	b.cc 0x008ae974
008ae930	adrp x8,0xd1f000
008ae934	add x8,x8,#0x1e0
008ae938	adrp x20,0xd1f000
008ae93c	ldarb w8,[x8]
008ae940	tbz w8,#0x0,0x008aea20
008ae944	ldr x8,[x20, #0x1d8]
008ae948	add x8,x8,#0x7f2, LSL #12
008ae94c	add x0,x8,#0xef0
008ae950	b 0x008ae974
008ae954	mov w9,#0xffffd8f1
008ae958	cmp w20,w9
008ae95c	b.lt 0x008ae968
008ae960	add x0,x8,w20, SXTW  #0x4
008ae964	b 0x008ae974
008ae968	mov x0,x19
008ae96c	mov w1,w20
008ae970	bl 0x008aea7c
008ae974	ldr x20,[x0]
008ae978	ldr x2,[x19, #0x78]
008ae97c	mov x0,x19
008ae980	ldrb w1,[x20, #0x5]
008ae984	ldr x3,[x20, #0x18]
008ae988	bl 0x008b4d5c
008ae98c	ldrb w8,[x20, #0x5]
008ae990	cbz w8,0x008ae9b8
008ae994	mov x8,xzr
008ae998	add x9,x20,#0x20
008ae99c	add x10,x0,#0x20
008ae9a0	ldr q0,[x9], #0x10
008ae9a4	add x8,x8,#0x1
008ae9a8	str q0,[x10], #0x10
008ae9ac	ldrb w11,[x20, #0x5]
008ae9b0	cmp x8,x11
008ae9b4	b.cc 0x008ae9a0
008ae9b8	ldr x8,[x19, #0x68]
008ae9bc	mov w10,#0x7
008ae9c0	str x0,[x8]
008ae9c4	ldr x9,[x19, #0x68]
008ae9c8	str w10,[x8, #0xc]
008ae9cc	add x8,x9,#0x10
008ae9d0	str x8,[x19, #0x68]
008ae9d4	ldr x8,[x21, #0x28]
008ae9d8	ldr x9,[sp, #0x8]
008ae9dc	cmp x8,x9
008ae9e0	b.ne 0x008aea78
008ae9e4	ldp x20,x19,[sp, #0x30]
008ae9e8	ldr x21,[sp, #0x20]
008ae9ec	ldp x29,x30,[sp, #0x10]
008ae9f0	add sp,sp,#0x40
008ae9f4	ret
008ae9f8	adrp x1,0x2b6000
008ae9fc	add x1,x1,#0xc71
008aea00	mov x0,x19
008aea04	bl 0x008b9568
008aea08	ldr x8,[x21, #0x28]
008aea0c	ldr x9,[sp, #0x8]
008aea10	cmp x8,x9
008aea14	b.ne 0x008aea78
008aea18	mov x0,x19
008aea1c	bl 0x008aa5f4
008aea20	adrp x0,0xd1f000
008aea24	add x0,x0,#0x1e0
008aea28	bl 0x00c2fe90
008aea2c	cbz w0,0x008ae944
008aea30	adrp x8,0xcca000
008aea34	ldr x0,[x8, #0x8c8]
008aea38	bl 0x007fe1ec
008aea3c	str x0,[x20, #0x1d8]
008aea40	adrp x0,0xd1f000
008aea44	add x0,x0,#0x1e0
008aea48	bl 0x00c2fea0
008aea4c	b 0x008ae944
008aea78	bl 0x00c2fec0
