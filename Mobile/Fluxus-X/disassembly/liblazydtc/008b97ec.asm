; FUN_008b97ec @ 008b97ec
008b97ec	sub sp,sp,#0x40
008b97f0	stp x29,x30,[sp, #0x20]
008b97f4	stp x20,x19,[sp, #0x30]
008b97f8	add x29,sp,#0x20
008b97fc	mrs x19,tpidr_el0
008b9800	adrp x20,0xd1f000
008b9804	ldr x8,[x19, #0x28]
008b9808	stur x8,[x29, #-0x8]
008b980c	adrp x8,0xd1f000
008b9810	add x8,x8,#0xb60
008b9814	ldarb w8,[x8]
008b9818	tbz w8,#0x0,0x008b986c
008b981c	add x1,sp,#0x8
008b9820	mov w0,#0x1
008b9824	bl 0x00c308e0
008b9828	ldp d1,d2,[sp, #0x8]
008b982c	ldr d0,[x20, #0xb58]
008b9830	ldr x8,[x19, #0x28]
008b9834	ldur x9,[x29, #-0x8]
008b9838	cmp x8,x9
008b983c	b.ne 0x008b98a0
008b9840	mov x8,#0xcd6500000000
008b9844	scvtf d1,d1
008b9848	scvtf d2,d2
008b984c	movk x8,#0x41cd, LSL #48
008b9850	fmov d3,x8
008b9854	fmadd d1,d1,d3,d2
008b9858	fmul d0,d1,d0
008b985c	ldp x20,x19,[sp, #0x30]
008b9860	ldp x29,x30,[sp, #0x20]
008b9864	add sp,sp,#0x40
008b9868	ret
008b986c	adrp x0,0xd1f000
008b9870	add x0,x0,#0xb60
008b9874	bl 0x00c2fe90
008b9878	cbz w0,0x008b981c
008b987c	mov x8,#0xd695
008b9880	adrp x0,0xd1f000
008b9884	add x0,x0,#0xb60
008b9888	movk x8,#0xe826, LSL #16
008b988c	movk x8,#0x2e0b, LSL #32
008b9890	movk x8,#0x3e11, LSL #48
008b9894	str x8,[x20, #0xb58]
008b9898	bl 0x00c2fea0
008b989c	b 0x008b981c
008b98a0	bl 0x00c2fec0
