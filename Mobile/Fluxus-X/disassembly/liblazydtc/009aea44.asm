; FUN_009aea44 @ 009aea44
009aea44	str x25,[sp, #-0x50]!
009aea48	stp x24,x23,[sp, #0x10]
009aea4c	stp x22,x21,[sp, #0x20]
009aea50	stp x20,x19,[sp, #0x30]
009aea54	stp x29,x30,[sp, #0x40]
009aea58	ldr x8,[x1]
009aea5c	mov x23,x0
009aea60	add x29,sp,#0x40
009aea64	mov x22,x3
009aea68	mov x0,x8
009aea6c	mov x21,x2
009aea70	mov x19,x1
009aea74	bl 0x00c35330
009aea78	cbz x0,0x009aeb7c
009aea7c	mov x20,x0
009aea80	bl 0x00c325e0
009aea84	cmp w0,#0x1
009aea88	b.lt 0x009aeac0
009aea8c	mov x0,x20
009aea90	mov w1,wzr
009aea94	bl 0x00c32610
009aea98	ldr w8,[x0, #0x2c]
009aea9c	cmp w8,#0x304
009aeaa0	b.ne 0x009aeac0
009aeaa4	mov x0,x20
009aeaa8	mov w1,wzr
009aeaac	bl 0x00c35320
009aeab0	mov x0,x20
009aeab4	bl 0x00c325e0
009aeab8	cmp w0,#0x0
009aeabc	b.gt 0x009aea8c
009aeac0	mov x0,x22
009aeac4	bl 0x00c325e0
009aeac8	cmp w0,#0x1
009aeacc	b.lt 0x009aeb28
009aead0	adrp x25,0x74b000
009aead4	add w24,w0,#0x1
009aead8	add x25,x25,#0xf1c
009aeadc	sub w1,w24,#0x2
009aeae0	mov x0,x22
009aeae4	bl 0x00c32610
009aeae8	ldr w8,[x0, #0x24]
009aeaec	ldr w9,[x23, #0x640]
009aeaf0	tst w9,w8
009aeaf4	b.ne 0x009aeb1c
009aeaf8	ldrb w8,[x0, #0x40]
009aeafc	ldr w9,[x23, #0x644]
009aeb00	mov x1,x0
009aeb04	lsl x8,x8,#0x3
009aeb08	ldr w8,[x25, x8#0x0]
009aeb0c	tst w9,w8
009aeb10	b.ne 0x009aeb1c
009aeb14	mov x0,x20
009aeb18	bl 0x00c35360
009aeb1c	sub w24,w24,#0x1
009aeb20	cmp w24,#0x1
009aeb24	b.gt 0x009aeadc
009aeb28	mov x0,x20
009aeb2c	bl 0x00c35330
009aeb30	cbz x0,0x009aeb70
009aeb34	mov x22,x0
009aeb38	ldr x0,[x21]
009aeb3c	bl 0x00c34770
009aeb40	str x22,[x21]
009aeb44	adrp x1,0xcb5000
009aeb48	ldr x1,[x1, #0x180]
009aeb4c	mov x0,x22
009aeb50	bl 0x00c34df0
009aeb54	ldr x0,[x21]
009aeb58	bl 0x00c35350
009aeb5c	ldr x0,[x19]
009aeb60	bl 0x00c34770
009aeb64	mov w0,#0x1
009aeb68	str x20,[x19]
009aeb6c	b 0x009aeb7c
009aeb70	mov x0,x20
009aeb74	bl 0x00c34770
009aeb78	mov w0,wzr
009aeb7c	ldp x29,x30,[sp, #0x40]
009aeb80	ldp x20,x19,[sp, #0x30]
009aeb84	ldp x22,x21,[sp, #0x20]
009aeb88	ldp x24,x23,[sp, #0x10]
009aeb8c	ldr x25,[sp], #0x50
009aeb90	ret
