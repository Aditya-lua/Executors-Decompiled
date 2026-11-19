; cpr::Session::SetCookies @ 008ee92c
008ee92c	sub sp,sp,#0x50
008ee930	stp x22,x21,[sp, #0x20]
008ee934	stp x20,x19,[sp, #0x30]
008ee938	stp x29,x30,[sp, #0x40]
008ee93c	add x29,sp,#0x40
008ee940	mrs x21,tpidr_el0
008ee944	ldr x8,[x21, #0x28]
008ee948	mov x19,x0
008ee94c	adrp x2,0x2d4000
008ee950	mov x20,x1
008ee954	str x8,[sp, #0x18]
008ee958	ldr x8,[x0, #0x18]
008ee95c	add x2,x2,#0xf78
008ee960	mov w1,#0x2797
008ee964	ldr x0,[x8]
008ee968	bl 0x00c317c0
008ee96c	ldr x1,[x19, #0x18]
008ee970	mov x8,sp
008ee974	mov x0,x20
008ee978	mov x22,sp
008ee97c	ldr x19,[x1]
008ee980	bl 0x00c30e10
008ee984	ldrb w8,[sp]
008ee988	ldr x9,[sp, #0x10]
008ee98c	orr x10,x22,#0x1
008ee990	tst w8,#0x1
008ee994	csel x2,x10,x9,eq
008ee998	mov w1,#0x2726
008ee99c	mov x0,x19
008ee9a0	bl 0x00c317c0
008ee9a4	ldrb w8,[sp]
008ee9a8	tbz w8,#0x0,0x008ee9b4
008ee9ac	ldr x0,[sp, #0x10]
008ee9b0	bl 0x00c301d0
008ee9b4	ldr x8,[x21, #0x28]
008ee9b8	ldr x9,[sp, #0x18]
008ee9bc	cmp x8,x9
008ee9c0	b.ne 0x008ee9d8
008ee9c4	ldp x29,x30,[sp, #0x40]
008ee9c8	ldp x20,x19,[sp, #0x30]
008ee9cc	ldp x22,x21,[sp, #0x20]
008ee9d0	add sp,sp,#0x50
008ee9d4	ret
008ee9d8	bl 0x00c2fec0
