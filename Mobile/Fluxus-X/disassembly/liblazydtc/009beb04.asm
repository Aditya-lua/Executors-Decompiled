; SSL_set_session_ticket_ext @ 009beb04
009beb04	str x23,[sp, #-0x40]!
009beb08	stp x22,x21,[sp, #0x10]
009beb0c	stp x20,x19,[sp, #0x20]
009beb10	stp x29,x30,[sp, #0x30]
009beb14	ldr w8,[x0]
009beb18	mov w20,w2
009beb1c	mov x21,x0
009beb20	mov w0,wzr
009beb24	cmp w8,#0x301
009beb28	add x29,sp,#0x30
009beb2c	b.lt 0x009bebd4
009beb30	ldr x0,[x21, #0xae0]
009beb34	adrp x23,0x2db000
009beb38	add x23,x23,#0xb17
009beb3c	mov x19,x1
009beb40	mov w2,#0x475
009beb44	mov x1,x23
009beb48	bl 0x00c32310
009beb4c	sxtw x22,w20
009beb50	add x0,x22,#0x10
009beb54	mov w2,#0x478
009beb58	mov x1,x23
009beb5c	str xzr,[x21, #0xae0]
009beb60	bl 0x00c32320
009beb64	str x0,[x21, #0xae0]
009beb68	cbz x0,0x009beb90
009beb6c	cbz x19,0x009bebc8
009beb70	add x8,x0,#0x10
009beb74	strh w20,[x0]
009beb78	str x8,[x0, #0x8]
009beb7c	mov x0,x8
009beb80	mov x1,x19
009beb84	mov x2,x22
009beb88	bl 0x00c2ffd0
009beb8c	b 0x009bebd0
009beb90	bl 0x00c342a0
009beb94	adrp x0,0x2db000
009beb98	adrp x2,0x2d9000
009beb9c	add x0,x0,#0xb17
009beba0	add x2,x2,#0x7ea
009beba4	mov w1,#0x47a
009beba8	bl 0x00c342b0
009bebac	mov w1,#0x100
009bebb0	mov w0,#0x14
009bebb4	movk w1,#0xc, LSL #16
009bebb8	mov x2,xzr
009bebbc	bl 0x00c342c0
009bebc0	mov w0,wzr
009bebc4	b 0x009bebd4
009bebc8	strh wzr,[x0]
009bebcc	str xzr,[x0, #0x8]
009bebd0	mov w0,#0x1
009bebd4	ldp x29,x30,[sp, #0x30]
009bebd8	ldp x20,x19,[sp, #0x20]
009bebdc	ldp x22,x21,[sp, #0x10]
009bebe0	ldr x23,[sp], #0x40
009bebe4	ret
