; FUN_008ad800 @ 008ad800
008ad800	sub sp,sp,#0x50
008ad804	stp x29,x30,[sp, #0x20]
008ad808	stp x22,x21,[sp, #0x30]
008ad80c	stp x20,x19,[sp, #0x40]
008ad810	add x29,sp,#0x20
008ad814	mrs x22,tpidr_el0
008ad818	mov x20,x2
008ad81c	mov x19,x0
008ad820	ldr x8,[x22, #0x28]
008ad824	cmp w1,#0x1
008ad828	stur x8,[x29, #-0x8]
008ad82c	b.lt 0x008ad868
008ad830	ldp x9,x8,[x19, #0x68]
008ad834	add x8,x8,w1, UXTW  #0x4
008ad838	sub x21,x8,#0x10
008ad83c	cmp x21,x9
008ad840	b.cc 0x008ad88c
008ad844	adrp x8,0xd1f000
008ad848	add x8,x8,#0x1e0
008ad84c	adrp x21,0xd1f000
008ad850	ldarb w8,[x8]
008ad854	tbz w8,#0x0,0x008ad8f8
008ad858	ldr x8,[x21, #0x1d8]
008ad85c	add x8,x8,#0x7f2, LSL #12
008ad860	add x21,x8,#0xef0
008ad864	b 0x008ad88c
008ad868	mov w8,#0xffffd8f1
008ad86c	cmp w1,w8
008ad870	b.lt 0x008ad880
008ad874	ldr x8,[x19, #0x68]
008ad878	add x21,x8,w1, SXTW  #0x4
008ad87c	b 0x008ad88c
008ad880	mov x0,x19
008ad884	bl 0x008aea7c
008ad888	mov x21,x0
008ad88c	mov x0,x20
008ad890	bl 0x00c2ff50
008ad894	mov x2,x0
008ad898	mov x0,x19
008ad89c	mov x1,x20
008ad8a0	bl 0x008b9ff8
008ad8a4	ldr x8,[x19, #0x68]
008ad8a8	str x0,[sp, #0x8]
008ad8ac	mov w9,#0x5
008ad8b0	add x2,sp,#0x8
008ad8b4	mov x0,x19
008ad8b8	mov x1,x21
008ad8bc	sub x3,x8,#0x10
008ad8c0	str w9,[sp, #0x14]
008ad8c4	bl 0x008cb374
008ad8c8	ldr x8,[x19, #0x68]
008ad8cc	sub x8,x8,#0x10
008ad8d0	str x8,[x19, #0x68]
008ad8d4	ldr x8,[x22, #0x28]
008ad8d8	ldur x9,[x29, #-0x8]
008ad8dc	cmp x8,x9
008ad8e0	b.ne 0x008ad950
008ad8e4	ldp x20,x19,[sp, #0x40]
008ad8e8	ldp x22,x21,[sp, #0x30]
008ad8ec	ldp x29,x30,[sp, #0x20]
008ad8f0	add sp,sp,#0x50
008ad8f4	ret
008ad8f8	adrp x0,0xd1f000
008ad8fc	add x0,x0,#0x1e0
008ad900	bl 0x00c2fe90
008ad904	cbz w0,0x008ad858
008ad908	adrp x8,0xcca000
008ad90c	ldr x0,[x8, #0x8c8]
008ad910	bl 0x007fe1ec
008ad914	str x0,[x21, #0x1d8]
008ad918	adrp x0,0xd1f000
008ad91c	add x0,x0,#0x1e0
008ad920	bl 0x00c2fea0
008ad924	b 0x008ad858
008ad950	bl 0x00c2fec0
