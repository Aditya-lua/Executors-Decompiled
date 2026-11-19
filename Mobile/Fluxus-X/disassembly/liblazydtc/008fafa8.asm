; cpr::GlobalThreadPool::GetInstance @ 008fafa8
008fafa8	stp x20,x19,[sp, #-0x20]!
008fafac	stp x29,x30,[sp, #0x10]
008fafb0	add x29,sp,#0x10
008fafb4	adrp x20,0xcb4000
008fafb8	ldr x20,[x20, #0xc68]
008fafbc	ldr x0,[x20]
008fafc0	cbnz x0,0x008fb020
008fafc4	adrp x0,0xcb4000
008fafc8	ldr x0,[x0, #0xc70]
008fafcc	bl 0x00c2ff10
008fafd0	ldr x8,[x20]
008fafd4	cbnz x8,0x008fb010
008fafd8	mov w0,#0x100
008fafdc	bl 0x00c2fed0
008fafe0	mov x19,x0
008fafe4	bl 0x00c31880
008fafe8	mov w2,w0
008fafec	mov w1,#0x1
008faff0	mov w3,#0xea60
008faff4	mov x0,x19
008faff8	bl 0x00c31860
008faffc	adrp x8,0xcb4000
008fb000	ldr x8,[x8, #0xc78]
008fb004	str x19,[x20]
008fb008	add x8,x8,#0x10
008fb00c	str x8,[x19]
008fb010	adrp x0,0xcb4000
008fb014	ldr x0,[x0, #0xc70]
008fb018	bl 0x00c2ff20
008fb01c	ldr x0,[x20]
008fb020	ldp x29,x30,[sp, #0x10]
008fb024	ldp x20,x19,[sp], #0x20
008fb028	ret
