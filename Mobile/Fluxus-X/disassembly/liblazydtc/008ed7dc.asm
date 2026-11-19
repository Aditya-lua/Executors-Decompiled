; cpr::Session::SetResolve @ 008ed7dc
008ed7dc	sub sp,sp,#0xa0
008ed7e0	stp x22,x21,[sp, #0x70]
008ed7e4	stp x20,x19,[sp, #0x80]
008ed7e8	stp x29,x30,[sp, #0x90]
008ed7ec	add x29,sp,#0x90
008ed7f0	mrs x21,tpidr_el0
008ed7f4	ldr x8,[x21, #0x28]
008ed7f8	mov x20,x0
008ed7fc	stur x8,[x29, #-0x28]
008ed800	add x0,sp,#0x20
008ed804	bl 0x00c311a0
008ed808	stp xzr,xzr,[sp, #0x8]
008ed80c	str xzr,[sp, #0x18]
008ed810	mov w0,#0x48
008ed814	bl 0x00c2fed0
008ed818	mov x19,x0
008ed81c	add x22,x0,#0x48
008ed820	stp x0,x0,[sp, #0x8]
008ed824	str x22,[sp, #0x18]
008ed828	add x1,sp,#0x20
008ed82c	bl 0x00c311a0
008ed830	str x22,[sp, #0x10]
008ed834	add x1,sp,#0x8
008ed838	mov x0,x20
008ed83c	bl 0x00c31230
008ed840	ldr x1,[x19, #0x38]
008ed844	add x0,x19,#0x30
008ed848	bl 0x00c316d0
008ed84c	ldrb w8,[x19, #0x18]
008ed850	tbz w8,#0x0,0x008ed85c
008ed854	ldr x0,[x19, #0x28]
008ed858	bl 0x00c301d0
008ed85c	ldrb w8,[x19]
008ed860	tbz w8,#0x0,0x008ed86c
008ed864	ldr x0,[x19, #0x10]
008ed868	bl 0x00c301d0
008ed86c	mov x0,x19
008ed870	str x19,[sp, #0x10]
008ed874	bl 0x00c301d0
008ed878	ldr x1,[sp, #0x58]
008ed87c	add x8,sp,#0x20
008ed880	add x0,x8,#0x30
008ed884	bl 0x00c316d0
008ed888	ldrb w8,[sp, #0x38]
008ed88c	tbz w8,#0x0,0x008ed898
008ed890	ldr x0,[sp, #0x48]
008ed894	bl 0x00c301d0
008ed898	ldrb w8,[sp, #0x20]
008ed89c	tbz w8,#0x0,0x008ed8a8
008ed8a0	ldr x0,[sp, #0x30]
008ed8a4	bl 0x00c301d0
008ed8a8	ldr x8,[x21, #0x28]
008ed8ac	ldur x9,[x29, #-0x28]
008ed8b0	cmp x8,x9
008ed8b4	b.ne 0x008ed8cc
008ed8b8	ldp x29,x30,[sp, #0x90]
008ed8bc	ldp x20,x19,[sp, #0x80]
008ed8c0	ldp x22,x21,[sp, #0x70]
008ed8c4	add sp,sp,#0xa0
008ed8c8	ret
008ed8cc	bl 0x00c2fec0
