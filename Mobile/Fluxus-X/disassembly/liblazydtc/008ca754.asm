; FUN_008ca754 @ 008ca754
008ca754	stp x29,x30,[sp, #-0x50]!
008ca758	str x25,[sp, #0x10]
008ca75c	stp x24,x23,[sp, #0x20]
008ca760	stp x22,x21,[sp, #0x30]
008ca764	stp x20,x19,[sp, #0x40]
008ca768	mov x29,sp
008ca76c	ldr x8,[x0, #0x8]
008ca770	mov w20,w2
008ca774	mov x22,x0
008ca778	cbz x8,0x008ca790
008ca77c	ldr x8,[x22, #0x18]
008ca780	mov x21,x1
008ca784	cbz x8,0x008ca7a0
008ca788	ldp x19,x24,[x22, #0x20]
008ca78c	b 0x008ca7fc
008ca790	ldr x8,[x22]
008ca794	ldr x8,[x8, #0x8]
008ca798	ldr x0,[x8, w20, UXTW #0x3]
008ca79c	b 0x008ca8d8
008ca7a0	ldr x8,[x22, #0x10]
008ca7a4	mov w9,#0x2
008ca7a8	ldrsw x8,[x8, #0x9c]
008ca7ac	lsl x8,x8,#0x1
008ca7b0	mov x24,x9
008ca7b4	lsl x9,x9,#0x1
008ca7b8	cmp x24,x8
008ca7bc	b.cc 0x008ca7b0
008ca7c0	lsr x8,x24,#0x3d
008ca7c4	str x21,[x22, #0x18]
008ca7c8	cbnz x8,0x008ca8f0
008ca7cc	lsl x23,x24,#0x3
008ca7d0	mov x0,x21
008ca7d4	mov w2,wzr
008ca7d8	mov x1,x23
008ca7dc	bl 0x008b7610
008ca7e0	mov x19,x0
008ca7e4	stp x0,x24,[x22, #0x20]
008ca7e8	cbz x24,0x008ca7fc
008ca7ec	mov x0,x19
008ca7f0	mov w1,wzr
008ca7f4	mov x2,x23
008ca7f8	bl 0x00c301c0
008ca7fc	sub x8,x24,#0x1
008ca800	mov w24,w20
008ca804	and x23,x8,x24
008ca808	ldr x0,[x19, x23, LSL #0x3]
008ca80c	cbz x0,0x008ca82c
008ca810	ldr w9,[x0, #0x98]
008ca814	cmp w9,w20
008ca818	b.eq 0x008ca8d8
008ca81c	add x9,x23,#0x1
008ca820	and x23,x9,x8
008ca824	ldr x0,[x19, x23, LSL #0x3]
008ca828	cbnz x0,0x008ca810
008ca82c	ldp x25,x22,[x22, #0x8]
008ca830	mov x0,x21
008ca834	bl 0x008b4cdc
008ca838	ldr x9,[x21, #0x60]
008ca83c	mov w10,#0x5588
008ca840	ldr x11,[x22, #0x70]
008ca844	str w20,[x0, #0x98]
008ca848	ldr w8,[x9, x10#0x0]
008ca84c	str x11,[x0, #0x70]
008ca850	cbz w8,0x008ca85c
008ca854	add w11,w8,#0x1
008ca858	str w11,[x9, x10#0x0]
008ca85c	ldr x9,[x25, #0x70]
008ca860	str w8,[x0, #0xcc]
008ca864	ldr x8,[x22, #0x68]
008ca868	ldr x10,[x25]
008ca86c	ldr w9,[x9, x24, LSL #0x2]
008ca870	str x8,[x0, #0x68]
008ca874	add x8,x10,x9
008ca878	ldrb w9,[x8]
008ca87c	strb w9,[x0, #0x5]
008ca880	ldrb w9,[x8, #0x1]
008ca884	strb w9,[x0, #0x7]
008ca888	ldrb w9,[x8, #0x2]
008ca88c	strb w9,[x0, #0x6]
008ca890	ldrb w9,[x25, #0x39]
008ca894	ldrb w10,[x8, #0x3]
008ca898	cmp w9,#0x4
008ca89c	strb w10,[x0, #0x3]
008ca8a0	b.cc 0x008ca8ac
008ca8a4	ldrb w8,[x8, #0x4]
008ca8a8	strb w8,[x0, #0x4]
008ca8ac	adrp x8,0x364000
008ca8b0	add x8,x8,#0xcc0
008ca8b4	ldr w9,[x25, #0x20]
008ca8b8	str x8,[x0, #0x30]
008ca8bc	str x8,[x0, #0x18]
008ca8c0	mov w8,#0x1
008ca8c4	str w8,[x0, #0xb8]
008ca8c8	add w8,w9,#0x1
008ca8cc	str x25,[x0, #0xe8]
008ca8d0	str w8,[x25, #0x20]
008ca8d4	str x0,[x19, x23, LSL #0x3]
008ca8d8	ldp x20,x19,[sp, #0x40]
008ca8dc	ldr x25,[sp, #0x10]
008ca8e0	ldp x22,x21,[sp, #0x30]
008ca8e4	ldp x24,x23,[sp, #0x20]
008ca8e8	ldp x29,x30,[sp], #0x50
008ca8ec	ret
008ca8f0	mov x0,x21
008ca8f4	bl 0x008b75fc
