; FUN_008c8f9c @ 008c8f9c
008c8f9c	ldr w8,[x1, #0x20]
008c8fa0	subs w8,w8,#0x1
008c8fa4	str w8,[x1, #0x20]
008c8fa8	b.eq 0x008c8fb0
008c8fac	ret
008c8fb0	stp x29,x30,[sp, #-0x20]!
008c8fb4	stp x20,x19,[sp, #0x10]
008c8fb8	mov x29,sp
008c8fbc	ldr x9,[x1, #0x18]
008c8fc0	cbz x9,0x008c8fe0
008c8fc4	ldr x8,[x1, #0x10]
008c8fc8	mov x19,x0
008c8fcc	mov x20,x1
008c8fd0	mov x0,x8
008c8fd4	blr x9
008c8fd8	mov x0,x19
008c8fdc	mov x1,x20
008c8fe0	ldr w9,[x1, #0x68]
008c8fe4	ldr x8,[x1, #0x60]
008c8fe8	mov x20,x1
008c8fec	ldrb w3,[x1, #0x38]
008c8ff0	mov x19,x0
008c8ff4	lsl x2,x9,#0x2
008c8ff8	mov x1,x8
008c8ffc	bl 0x008b7a9c
008c9000	ldr w8,[x20, #0x78]
008c9004	ldr x1,[x20, #0x70]
008c9008	mov x0,x19
008c900c	ldrb w3,[x20, #0x38]
008c9010	lsl x2,x8,#0x2
008c9014	bl 0x008b7a9c
008c9018	ldrb w3,[x20, #0x38]
008c901c	mov x0,x19
008c9020	mov x1,x20
008c9024	mov w2,#0x80
008c9028	ldp x20,x19,[sp, #0x10]
008c902c	ldp x29,x30,[sp], #0x20
008c9030	b 0x008b7a9c
