; FUN_00b0ad24 @ 00b0ad24
00b0ad24	stp x22,x21,[sp, #-0x30]!
00b0ad28	stp x20,x19,[sp, #0x10]
00b0ad2c	stp x29,x30,[sp, #0x20]
00b0ad30	add x29,sp,#0x20
00b0ad34	cbz x1,0x00b0ad84
00b0ad38	mov x21,x1
00b0ad3c	adrp x1,0x2aa000
00b0ad40	mov w22,w2
00b0ad44	mov x20,x0
00b0ad48	add x1,x1,#0xba3
00b0ad4c	mov w0,#0x10
00b0ad50	orr w2,wzr,#0x1c0
00b0ad54	bl 0x00c34250
00b0ad58	cbz x0,0x00b0ad8c
00b0ad5c	mov x19,x0
00b0ad60	str wzr,[x0]
00b0ad64	cbz w22,0x00b0adc4
00b0ad68	mov w8,#0x2
00b0ad6c	mov x0,x21
00b0ad70	str w8,[x19]
00b0ad74	str x21,[x19, #0x8]
00b0ad78	bl 0x00c3f810
00b0ad7c	cbnz w0,0x00b0addc
00b0ad80	b 0x00b0ae08
00b0ad84	mov w20,wzr
00b0ad88	b 0x00b0ae8c
00b0ad8c	bl 0x00c342a0
00b0ad90	adrp x0,0x2aa000
00b0ad94	adrp x2,0x2b0000
00b0ad98	add x0,x0,#0xba3
00b0ad9c	add x2,x2,#0xa62
00b0ada0	mov w1,#0x1c3
00b0ada4	bl 0x00c342b0
00b0ada8	mov w1,#0x100
00b0adac	mov w0,#0xb
00b0adb0	movk w1,#0xc, LSL #16
00b0adb4	mov x2,xzr
00b0adb8	bl 0x00c342c0
00b0adbc	mov w20,wzr
00b0adc0	b 0x00b0ae8c
00b0adc4	mov w8,#0x1
00b0adc8	mov x0,x21
00b0adcc	str w8,[x19]
00b0add0	str x21,[x19, #0x8]
00b0add4	bl 0x00c350b0
00b0add8	cbz w0,0x00b0ae08
00b0addc	ldr x0,[x20, #0x98]
00b0ade0	bl 0x00c356a0
00b0ade4	cbz w0,0x00b0ae08
00b0ade8	ldr x0,[x20, #0x8]
00b0adec	mov x1,x19
00b0adf0	bl 0x00b0b5d8
00b0adf4	cbz x0,0x00b0ae28
00b0adf8	ldr x0,[x20, #0x98]
00b0adfc	bl 0x00c35690
00b0ae00	mov w20,#0x1
00b0ae04	b 0x00b0ae50
00b0ae08	adrp x1,0x2aa000
00b0ae0c	add x1,x1,#0xba3
00b0ae10	mov w2,#0x1f3
00b0ae14	mov x0,x19
00b0ae18	str wzr,[x19]
00b0ae1c	bl 0x00c32310
00b0ae20	mov w20,wzr
00b0ae24	b 0x00b0ae8c
00b0ae28	ldr x0,[x20, #0x8]
00b0ae2c	mov x1,x19
00b0ae30	bl 0x00c347a0
00b0ae34	ldr x8,[x20, #0x98]
00b0ae38	mov w21,w0
00b0ae3c	cmp w0,#0x0
00b0ae40	cset w20,ne
00b0ae44	mov x0,x8
00b0ae48	bl 0x00c35690
00b0ae4c	cbnz w21,0x00b0ae8c
00b0ae50	ldr w8,[x19]
00b0ae54	cmp w8,#0x2
00b0ae58	b.eq 0x00b0ae70
00b0ae5c	cmp w8,#0x1
00b0ae60	b.ne 0x00b0ae78
00b0ae64	ldr x0,[x19, #0x8]
00b0ae68	bl 0x00c31a90
00b0ae6c	b 0x00b0ae78
00b0ae70	ldr x0,[x19, #0x8]
00b0ae74	bl 0x00c382b0
00b0ae78	adrp x1,0x2aa000
00b0ae7c	add x1,x1,#0xba3
00b0ae80	mov w2,#0x1f3
00b0ae84	mov x0,x19
00b0ae88	bl 0x00c32310
00b0ae8c	mov w0,w20
00b0ae90	ldp x29,x30,[sp, #0x20]
00b0ae94	ldp x20,x19,[sp, #0x10]
00b0ae98	ldp x22,x21,[sp], #0x30
00b0ae9c	ret
