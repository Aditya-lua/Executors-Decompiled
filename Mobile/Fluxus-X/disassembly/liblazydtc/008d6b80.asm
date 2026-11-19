; LZ4_saveDict @ 008d6b80
008d6b80	stp x29,x30,[sp, #-0x30]!
008d6b84	stp x22,x21,[sp, #0x10]
008d6b88	stp x20,x19,[sp, #0x20]
008d6b8c	mov x29,sp
008d6b90	mov w22,#0x4018
008d6b94	mov w10,#0x10000
008d6b98	mov x20,x1
008d6b9c	ldr w8,[x0, x22#0x0]
008d6ba0	mov x19,x0
008d6ba4	cmp w2,w8
008d6ba8	csel w9,w2,w8,cc
008d6bac	cmp w9,#0x10, LSL #12
008d6bb0	csel w21,w9,w10,cc
008d6bb4	cbz w9,0x008d6bd0
008d6bb8	ldr x9,[x19, #0x4000]
008d6bbc	mov x0,x20
008d6bc0	mov x2,x21
008d6bc4	add x8,x9,x8
008d6bc8	sub x1,x8,x21
008d6bcc	bl 0x00c2ff60
008d6bd0	str x20,[x19, #0x4000]
008d6bd4	mov w0,w21
008d6bd8	str w21,[x19, x22#0x0]
008d6bdc	ldp x20,x19,[sp, #0x20]
008d6be0	ldp x22,x21,[sp, #0x10]
008d6be4	ldp x29,x30,[sp], #0x30
008d6be8	ret
