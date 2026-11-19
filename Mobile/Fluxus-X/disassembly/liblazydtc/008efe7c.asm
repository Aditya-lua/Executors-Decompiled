; cpr::Session::Head @ 008efe7c
008efe7c	stp x20,x19,[sp, #-0x20]!
008efe80	stp x29,x30,[sp, #0x10]
008efe84	add x29,sp,#0x10
008efe88	ldr x9,[x0, #0x18]
008efe8c	mov x19,x0
008efe90	mov w1,#0x2c
008efe94	mov w2,#0x1
008efe98	ldr x0,[x9]
008efe9c	mov x20,x8
008efea0	bl 0x00c317c0
008efea4	ldr x8,[x19, #0x18]
008efea8	mov w1,#0x2734
008efeac	mov x2,xzr
008efeb0	ldr x0,[x8]
008efeb4	bl 0x00c317c0
008efeb8	mov x0,x19
008efebc	bl 0x00c31270
008efec0	ldr x8,[x19, #0x2a0]
008efec4	cbz x8,0x008efedc
008efec8	ldp x29,x30,[sp, #0x10]
008efecc	mov x8,x20
008efed0	mov x0,x19
008efed4	ldp x20,x19,[sp], #0x20
008efed8	b 0x00c313b0
008efedc	mov x0,x19
008efee0	bl 0x00c31250
008efee4	ldp x29,x30,[sp, #0x10]
008efee8	mov w1,w0
008efeec	mov x8,x20
008efef0	mov x0,x19
008efef4	ldp x20,x19,[sp], #0x20
008efef8	b 0x00c31380
