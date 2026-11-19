; cpr::Session::Get @ 008efdb4
008efdb4	stp x20,x19,[sp, #-0x20]!
008efdb8	stp x29,x30,[sp, #0x10]
008efdbc	add x29,sp,#0x10
008efdc0	mov x19,x0
008efdc4	mov x20,x8
008efdc8	bl 0x00c311b0
008efdcc	ldr x8,[x19, #0x2a0]
008efdd0	cbz x8,0x008efde8
008efdd4	ldp x29,x30,[sp, #0x10]
008efdd8	mov x8,x20
008efddc	mov x0,x19
008efde0	ldp x20,x19,[sp], #0x20
008efde4	b 0x00c313b0
008efde8	mov x0,x19
008efdec	bl 0x00c31250
008efdf0	ldp x29,x30,[sp, #0x10]
008efdf4	mov w1,w0
008efdf8	mov x8,x20
008efdfc	mov x0,x19
008efe00	ldp x20,x19,[sp], #0x20
008efe04	b 0x00c31380
