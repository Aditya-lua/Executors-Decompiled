; FUN_008ac76c @ 008ac76c
008ac76c	sub sp,sp,#0x60
008ac770	stp x29,x30,[sp, #0x10]
008ac774	str x25,[sp, #0x20]
008ac778	stp x24,x23,[sp, #0x30]
008ac77c	stp x22,x21,[sp, #0x40]
008ac780	stp x20,x19,[sp, #0x50]
008ac784	add x29,sp,#0x10
008ac788	mrs x25,tpidr_el0
008ac78c	mov x22,x4
008ac790	mov w20,w3
008ac794	ldr x8,[x25, #0x28]
008ac798	mov x21,x2
008ac79c	mov x19,x0
008ac7a0	mov x23,x1
008ac7a4	str x8,[sp, #0x8]
008ac7a8	ldr x8,[x0, #0x60]
008ac7ac	ldp x8,x9,[x8, #0x8]
008ac7b0	cmp x9,x8
008ac7b4	b.cc 0x008ac7c4
008ac7b8	mov x0,x19
008ac7bc	mov w1,#0x1
008ac7c0	bl 0x008b52c4
008ac7c4	ldrb w8,[x19, #0x2]
008ac7c8	tbz w8,#0x2,0x008ac7dc
008ac7cc	add x2,x19,#0x38
008ac7d0	mov x0,x19
008ac7d4	mov x1,x19
008ac7d8	bl 0x008b63a4
008ac7dc	ldr x8,[x19, #0x50]
008ac7e0	ldr x9,[x19, #0x68]
008ac7e4	ldr x10,[x8, #0x18]
008ac7e8	add x11,x9,#0x10
008ac7ec	cmp x11,x10
008ac7f0	b.ls 0x008ac858
008ac7f4	ldr x11,[x19, #0x70]
008ac7f8	mov w12,#0xf3f0
008ac7fc	movk w12,#0x1, LSL #16
008ac800	sub x11,x9,x11
008ac804	cmp x11,x12
008ac808	b.gt 0x008ac938
008ac80c	ldr x11,[x19, #0x48]
008ac810	sub x11,x11,x9
008ac814	cmp x11,#0x10
008ac818	b.gt 0x008ac848
008ac81c	mov w8,#0x1
008ac820	nop
008ac824	adr x1,0x8aa604
008ac828	add x2,sp,#0x4
008ac82c	mov x0,x19
008ac830	str w8,[sp, #0x4]
008ac834	bl 0x008b3edc
008ac838	cbnz w0,0x008ac938
008ac83c	ldr x8,[x19, #0x50]
008ac840	ldr x9,[x19, #0x68]
008ac844	ldr x10,[x8, #0x18]
008ac848	add x9,x9,#0x10
008ac84c	cmp x10,x9
008ac850	b.cs 0x008ac858
008ac854	str x9,[x8, #0x18]
008ac858	ldr x9,[x19, #0x20]
008ac85c	cmp x8,x9
008ac860	b.eq 0x008ac874
008ac864	ldr x8,[x8, #0x8]
008ac868	ldr x8,[x8]
008ac86c	add x8,x8,#0x10
008ac870	b 0x008ac878
008ac874	add x8,x19,#0x78
008ac878	ldr x2,[x8]
008ac87c	mov x0,x19
008ac880	mov w1,w20
008ac884	bl 0x008b4e40
008ac888	mov x24,x0
008ac88c	stp x22,x23,[x0, #0x20]
008ac890	cbz x21,0x008ac8b0
008ac894	mov x0,x21
008ac898	bl 0x00c2ff50
008ac89c	mov x2,x0
008ac8a0	mov x0,x19
008ac8a4	mov x1,x21
008ac8a8	bl 0x008b9ff8
008ac8ac	b 0x008ac8b4
008ac8b0	mov x0,xzr
008ac8b4	str x0,[x24, #0x18]
008ac8b8	ldr x8,[x19, #0x68]
008ac8bc	sub x8,x8,w20, SXTW  #0x4
008ac8c0	str x8,[x19, #0x68]
008ac8c4	cbz w20,0x008ac8f4
008ac8c8	sxtw x8,w20
008ac8cc	add x10,x24,#0x20
008ac8d0	lsl x9,x8,#0x4
008ac8d4	ldr x11,[x19, #0x68]
008ac8d8	sub x8,x8,#0x1
008ac8dc	add x11,x11,x9
008ac8e0	ldur q0,[x11, #-0x10]
008ac8e4	str q0,[x10,x9]
008ac8e8	sub x9,x9,#0x10
008ac8ec	cbnz x8,0x008ac8d4
008ac8f0	ldr x8,[x19, #0x68]
008ac8f4	str x24,[x8]
008ac8f8	mov w10,#0x7
008ac8fc	ldr x9,[x19, #0x68]
008ac900	str w10,[x8, #0xc]
008ac904	add x8,x9,#0x10
008ac908	str x8,[x19, #0x68]
008ac90c	ldr x8,[x25, #0x28]
008ac910	ldr x9,[sp, #0x8]
008ac914	cmp x8,x9
008ac918	b.ne 0x008ac960
008ac91c	ldp x20,x19,[sp, #0x50]
008ac920	ldr x25,[sp, #0x20]
008ac924	ldp x22,x21,[sp, #0x40]
008ac928	ldp x24,x23,[sp, #0x30]
008ac92c	ldp x29,x30,[sp, #0x10]
008ac930	add sp,sp,#0x60
008ac934	ret
008ac938	adrp x1,0x2b6000
008ac93c	add x1,x1,#0xc71
008ac940	mov x0,x19
008ac944	bl 0x008b9568
008ac948	ldr x8,[x25, #0x28]
008ac94c	ldr x9,[sp, #0x8]
008ac950	cmp x8,x9
008ac954	b.ne 0x008ac960
008ac958	mov x0,x19
008ac95c	bl 0x008aa5f4
008ac960	bl 0x00c2fec0
