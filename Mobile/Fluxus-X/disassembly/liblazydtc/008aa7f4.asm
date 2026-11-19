; FUN_008aa7f4 @ 008aa7f4
008aa7f4	sub sp,sp,#0x40
008aa7f8	stp x29,x30,[sp, #0x10]
008aa7fc	str x21,[sp, #0x20]
008aa800	stp x20,x19,[sp, #0x30]
008aa804	add x29,sp,#0x10
008aa808	mrs x21,tpidr_el0
008aa80c	mov x19,x0
008aa810	ldr x8,[x21, #0x28]
008aa814	str x8,[sp, #0x8]
008aa818	ldr x8,[x0, #0x60]
008aa81c	ldp x8,x9,[x8, #0x8]
008aa820	cmp x9,x8
008aa824	b.cc 0x008aa834
008aa828	mov x0,x19
008aa82c	mov w1,#0x1
008aa830	bl 0x008b52c4
008aa834	ldrb w8,[x19, #0x2]
008aa838	tbz w8,#0x2,0x008aa84c
008aa83c	add x2,x19,#0x38
008aa840	mov x0,x19
008aa844	mov x1,x19
008aa848	bl 0x008b63a4
008aa84c	ldr x8,[x19, #0x50]
008aa850	ldr x9,[x19, #0x68]
008aa854	ldr x10,[x8, #0x18]
008aa858	add x11,x9,#0x10
008aa85c	cmp x11,x10
008aa860	b.ls 0x008aa8c8
008aa864	ldr x11,[x19, #0x70]
008aa868	mov w12,#0xf3f0
008aa86c	movk w12,#0x1, LSL #16
008aa870	sub x11,x9,x11
008aa874	cmp x11,x12
008aa878	b.gt 0x008aa92c
008aa87c	ldr x11,[x19, #0x48]
008aa880	sub x11,x11,x9
008aa884	cmp x11,#0x10
008aa888	b.gt 0x008aa8b8
008aa88c	mov w8,#0x1
008aa890	nop
008aa894	adr x1,0x8aa604
008aa898	add x2,sp,#0x4
008aa89c	mov x0,x19
008aa8a0	str w8,[sp, #0x4]
008aa8a4	bl 0x008b3edc
008aa8a8	cbnz w0,0x008aa92c
008aa8ac	ldr x8,[x19, #0x50]
008aa8b0	ldr x9,[x19, #0x68]
008aa8b4	ldr x10,[x8, #0x18]
008aa8b8	add x9,x9,#0x10
008aa8bc	cmp x10,x9
008aa8c0	b.cs 0x008aa8c8
008aa8c4	str x9,[x8, #0x18]
008aa8c8	mov x0,x19
008aa8cc	bl 0x008b98d0
008aa8d0	ldr x9,[x19, #0x68]
008aa8d4	mov w11,#0x9
008aa8d8	mov x20,x0
008aa8dc	str x0,[x9]
008aa8e0	ldp x8,x10,[x19, #0x60]
008aa8e4	str w11,[x9, #0xc]
008aa8e8	ldr x8,[x8, #0x660]
008aa8ec	add x9,x10,#0x10
008aa8f0	str x9,[x19, #0x68]
008aa8f4	cbz x8,0x008aa904
008aa8f8	mov x0,x19
008aa8fc	mov x1,x20
008aa900	blr x8
008aa904	ldr x8,[x21, #0x28]
008aa908	ldr x9,[sp, #0x8]
008aa90c	cmp x8,x9
008aa910	b.ne 0x008aa954
008aa914	mov x0,x20
008aa918	ldp x20,x19,[sp, #0x30]
008aa91c	ldr x21,[sp, #0x20]
008aa920	ldp x29,x30,[sp, #0x10]
008aa924	add sp,sp,#0x40
008aa928	ret
008aa92c	adrp x1,0x2b6000
008aa930	add x1,x1,#0xc71
008aa934	mov x0,x19
008aa938	bl 0x008b9568
008aa93c	ldr x8,[x21, #0x28]
008aa940	ldr x9,[sp, #0x8]
008aa944	cmp x8,x9
008aa948	b.ne 0x008aa954
008aa94c	mov x0,x19
008aa950	bl 0x008aa5f4
008aa954	bl 0x00c2fec0
