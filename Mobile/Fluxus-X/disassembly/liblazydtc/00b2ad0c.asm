; FUN_00b2ad0c @ 00b2ad0c
00b2ad0c	sub sp,sp,#0x40
00b2ad10	stp x22,x21,[sp, #0x10]
00b2ad14	stp x20,x19,[sp, #0x20]
00b2ad18	stp x29,x30,[sp, #0x30]
00b2ad1c	add x29,sp,#0x30
00b2ad20	cbz x1,0x00b2af1c
00b2ad24	ldr x22,[x0, #0xa8]
00b2ad28	mov x20,x1
00b2ad2c	adrp x1,0x2bd000
00b2ad30	mov x19,x0
00b2ad34	add x1,x1,#0xa97
00b2ad38	mov x0,x20
00b2ad3c	bl 0x00c36530
00b2ad40	cbz x0,0x00b2ad5c
00b2ad44	add x1,sp,#0x8
00b2ad48	bl 0x00c3e920
00b2ad4c	cbz w0,0x00b2ade4
00b2ad50	ldr x8,[sp, #0x8]
00b2ad54	cmp x8,#0x20
00b2ad58	b.ne 0x00b2ae00
00b2ad5c	adrp x1,0x2c3000
00b2ad60	add x1,x1,#0x9bc
00b2ad64	mov x0,x20
00b2ad68	bl 0x00c36530
00b2ad6c	cbz x0,0x00b2ad88
00b2ad70	add x1,sp,#0x8
00b2ad74	bl 0x00c3e920
00b2ad78	cbz w0,0x00b2ae28
00b2ad7c	ldr x8,[sp, #0x8]
00b2ad80	cmp x8,#0xc
00b2ad84	b.ne 0x00b2ae44
00b2ad88	adrp x1,0x2c5000
00b2ad8c	add x1,x1,#0xa75
00b2ad90	mov x0,x20
00b2ad94	bl 0x00c36530
00b2ad98	cbz x0,0x00b2aea8
00b2ad9c	ldr w8,[x0, #0x8]
00b2ada0	mov x21,x0
00b2ada4	cmp w8,#0x5
00b2ada8	b.ne 0x00b2ae6c
00b2adac	ldr x2,[x21, #0x18]
00b2adb0	sub x8,x2,#0x1
00b2adb4	cmp x8,#0x10
00b2adb8	b.cc 0x00b2ae88
00b2adbc	bl 0x00c342a0
00b2adc0	adrp x0,0x2d0000
00b2adc4	adrp x2,0x2b8000
00b2adc8	add x0,x0,#0x7d3
00b2adcc	add x2,x2,#0xa86
00b2add0	mov w1,#0xcb
00b2add4	bl 0x00c342b0
00b2add8	mov w0,#0x39
00b2addc	mov w1,#0x76
00b2ade0	b 0x00b2af64
00b2ade4	bl 0x00c342a0
00b2ade8	adrp x0,0x2d0000
00b2adec	adrp x2,0x2b8000
00b2adf0	add x0,x0,#0x7d3
00b2adf4	add x2,x2,#0xa86
00b2adf8	mov w1,#0xb0
00b2adfc	b 0x00b2af58
00b2ae00	bl 0x00c342a0
00b2ae04	adrp x0,0x2d0000
00b2ae08	adrp x2,0x2b8000
00b2ae0c	add x0,x0,#0x7d3
00b2ae10	add x2,x2,#0xa86
00b2ae14	mov w1,#0xb4
00b2ae18	bl 0x00c342b0
00b2ae1c	mov w0,#0x39
00b2ae20	mov w1,#0x69
00b2ae24	b 0x00b2af64
00b2ae28	bl 0x00c342a0
00b2ae2c	adrp x0,0x2d0000
00b2ae30	adrp x2,0x2b8000
00b2ae34	add x0,x0,#0x7d3
00b2ae38	add x2,x2,#0xa86
00b2ae3c	mov w1,#0xbb
00b2ae40	b 0x00b2af58
00b2ae44	bl 0x00c342a0
00b2ae48	adrp x0,0x2d0000
00b2ae4c	adrp x2,0x2b8000
00b2ae50	add x0,x0,#0x7d3
00b2ae54	add x2,x2,#0xa86
00b2ae58	mov w1,#0xbf
00b2ae5c	bl 0x00c342b0
00b2ae60	mov w0,#0x39
00b2ae64	mov w1,#0x6d
00b2ae68	b 0x00b2af64
00b2ae6c	bl 0x00c342a0
00b2ae70	adrp x0,0x2d0000
00b2ae74	adrp x2,0x2b8000
00b2ae78	add x0,x0,#0x7d3
00b2ae7c	add x2,x2,#0xa86
00b2ae80	mov w1,#0xc7
00b2ae84	b 0x00b2af58
00b2ae88	ldr x1,[x21, #0x10]
00b2ae8c	cbz x1,0x00b2aea4
00b2ae90	ldrb w8,[x19, #0x6c]
00b2ae94	tbnz w8,#0x1,0x00b2afac
00b2ae98	add x0,x19,#0x2fc
00b2ae9c	bl 0x00c2ffd0
00b2aea0	ldr x2,[x21, #0x18]
00b2aea4	str x2,[x19, #0x338]
00b2aea8	adrp x1,0x2c3000
00b2aeac	add x1,x1,#0x9c2
00b2aeb0	mov x0,x20
00b2aeb4	bl 0x00c36530
00b2aeb8	cbz x0,0x00b2aee8
00b2aebc	ldr w8,[x0, #0x8]
00b2aec0	cmp w8,#0x5
00b2aec4	b.ne 0x00b2af24
00b2aec8	ldr x8,[x22, #0x28]
00b2aecc	ldp x1,x2,[x0, #0x10]
00b2aed0	mov x0,x19
00b2aed4	blr x8
00b2aed8	sxtw x8,w0
00b2aedc	str x8,[sp, #0x8]
00b2aee0	cbz w0,0x00b2af84
00b2aee4	str x8,[x19, #0x348]
00b2aee8	adrp x1,0x2d7000
00b2aeec	add x1,x1,#0xec0
00b2aef0	mov x0,x20
00b2aef4	bl 0x00c36530
00b2aef8	cbz x0,0x00b2af1c
00b2aefc	ldr w8,[x0, #0x8]
00b2af00	cmp w8,#0x5
00b2af04	b.ne 0x00b2af40
00b2af08	ldr x8,[x22, #0x30]
00b2af0c	ldp x1,x2,[x0, #0x10]
00b2af10	mov x0,x19
00b2af14	blr x8
00b2af18	cbz w0,0x00b2afd4
00b2af1c	mov w0,#0x1
00b2af20	b 0x00b2af70
00b2af24	bl 0x00c342a0
00b2af28	adrp x0,0x2d0000
00b2af2c	adrp x2,0x2b8000
00b2af30	add x0,x0,#0x7d3
00b2af34	add x2,x2,#0xa86
00b2af38	mov w1,#0xdb
00b2af3c	b 0x00b2af58
00b2af40	bl 0x00c342a0
00b2af44	adrp x0,0x2d0000
00b2af48	adrp x2,0x2b8000
00b2af4c	add x0,x0,#0x7d3
00b2af50	add x2,x2,#0xa86
00b2af54	mov w1,#0xe9
00b2af58	bl 0x00c342b0
00b2af5c	mov w0,#0x39
00b2af60	mov w1,#0x67
00b2af64	mov x2,xzr
00b2af68	bl 0x00c342c0
00b2af6c	mov w0,wzr
00b2af70	ldp x29,x30,[sp, #0x30]
00b2af74	ldp x20,x19,[sp, #0x20]
00b2af78	ldp x22,x21,[sp, #0x10]
00b2af7c	add sp,sp,#0x40
00b2af80	ret
00b2af84	bl 0x00c342a0
00b2af88	adrp x0,0x2d0000
00b2af8c	adrp x2,0x2b8000
00b2af90	add x0,x0,#0x7d3
00b2af94	add x2,x2,#0xa86
00b2af98	orr w1,wzr,#0xe0
00b2af9c	bl 0x00c342b0
00b2afa0	mov w0,#0x39
00b2afa4	mov w1,#0x73
00b2afa8	b 0x00b2af64
00b2afac	bl 0x00c342a0
00b2afb0	adrp x0,0x2d0000
00b2afb4	adrp x2,0x2b8000
00b2afb8	add x0,x0,#0x7d3
00b2afbc	add x2,x2,#0xa86
00b2afc0	mov w1,#0xd0
00b2afc4	bl 0x00c342b0
00b2afc8	mov w0,#0x39
00b2afcc	orr w1,wzr,#0x78
00b2afd0	b 0x00b2af64
00b2afd4	bl 0x00c342a0
00b2afd8	adrp x0,0x2d0000
00b2afdc	adrp x2,0x2b8000
00b2afe0	add x0,x0,#0x7d3
00b2afe4	add x2,x2,#0xa86
00b2afe8	mov w1,#0xed
00b2afec	b 0x00b2ae5c
