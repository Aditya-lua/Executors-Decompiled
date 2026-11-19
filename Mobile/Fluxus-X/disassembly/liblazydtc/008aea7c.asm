; FUN_008aea7c @ 008aea7c
008aea7c	stp x29,x30,[sp, #-0x20]!
008aea80	str x19,[sp, #0x10]
008aea84	mov x29,sp
008aea88	mov w8,#0xffffd8ee
008aea8c	cmp w1,w8
008aea90	b.eq 0x008aeadc
008aea94	mov w8,#0xffffd8ef
008aea98	cmp w1,w8
008aea9c	b.eq 0x008aeab8
008aeaa0	mov w8,#0xffffd8f0
008aeaa4	cmp w1,w8
008aeaa8	b.ne 0x008aeae8
008aeaac	ldr x8,[x0, #0x60]
008aeab0	add x0,x8,#0x620
008aeab4	b 0x008aeb5c
008aeab8	ldr x9,[x0, #0x50]
008aeabc	ldr x10,[x0, #0x20]
008aeac0	ldr x8,[x0, #0x60]
008aeac4	cmp x9,x10
008aeac8	b.eq 0x008aeb40
008aeacc	ldr x9,[x9, #0x8]
008aead0	ldr x9,[x9]
008aead4	add x9,x9,#0x10
008aead8	b 0x008aeb44
008aeadc	ldr x8,[x0, #0x60]
008aeae0	ldr x9,[x0, #0x78]
008aeae4	b 0x008aeb48
008aeae8	ldr x8,[x0, #0x50]
008aeaec	mov w9,#0xffffd8ee
008aeaf0	sub w9,w9,w1
008aeaf4	ldr x8,[x8, #0x8]
008aeaf8	ldr x8,[x8]
008aeafc	ldrb w10,[x8, #0x5]
008aeb00	cmp w9,w10
008aeb04	b.ls 0x008aeb2c
008aeb08	adrp x8,0xd1f000
008aeb0c	add x8,x8,#0x1e0
008aeb10	adrp x19,0xd1f000
008aeb14	ldarb w8,[x8]
008aeb18	tbz w8,#0x0,0x008aeb68
008aeb1c	ldr x8,[x19, #0x1d8]
008aeb20	add x8,x8,#0x7f2, LSL #12
008aeb24	add x0,x8,#0xef0
008aeb28	b 0x008aeb5c
008aeb2c	mov w9,#0xffffd8ed
008aeb30	sub w9,w9,w1
008aeb34	add x8,x8,w9, UXTW  #0x4
008aeb38	add x0,x8,#0x30
008aeb3c	b 0x008aeb5c
008aeb40	add x9,x0,#0x78
008aeb44	ldr x9,[x9]
008aeb48	str x9,[x8, #0x610]
008aeb4c	mov w10,#0x6
008aeb50	ldr x9,[x0, #0x60]
008aeb54	str w10,[x8, #0x61c]
008aeb58	add x0,x9,#0x610
008aeb5c	ldr x19,[sp, #0x10]
008aeb60	ldp x29,x30,[sp], #0x20
008aeb64	ret
008aeb68	adrp x0,0xd1f000
008aeb6c	add x0,x0,#0x1e0
008aeb70	bl 0x00c2fe90
008aeb74	cbz w0,0x008aeb1c
008aeb78	adrp x8,0xcca000
008aeb7c	ldr x0,[x8, #0x8c8]
008aeb80	bl 0x007fe1ec
008aeb84	str x0,[x19, #0x1d8]
008aeb88	adrp x0,0xd1f000
008aeb8c	add x0,x0,#0x1e0
008aeb90	bl 0x00c2fea0
008aeb94	b 0x008aeb1c
