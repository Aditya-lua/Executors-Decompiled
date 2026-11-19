; BIO_dump_indent_cb @ 009fb854
009fb854	sub sp,sp,#0x1d0
009fb858	cmp w4,#0x40
009fb85c	mov w8,#0x40
009fb860	csel w8,w4,w8,lt
009fb864	bic w10,w8,w8, ASR #0x1f
009fb868	orr w9,wzr,#0x6
009fb86c	cmp w10,#0x6
009fb870	add w8,w10,#0x3
009fb874	csel w9,w10,w9,lt
009fb878	sub w8,w8,w9
009fb87c	add w9,w8,#0x3
009fb880	cmp w8,#0x0
009fb884	csel w8,w9,w8,lt
009fb888	mov w9,#0x10
009fb88c	stp x24,x23,[sp, #0x190]
009fb890	sub w23,w9,w8, ASR #0x2
009fb894	sdiv w8,w3,w23
009fb898	mul w9,w8,w23
009fb89c	cmp w9,w3
009fb8a0	cinc w8,w8,lt
009fb8a4	cmp w8,#0x1
009fb8a8	stp x28,x27,[sp, #0x170]
009fb8ac	stp x26,x25,[sp, #0x180]
009fb8b0	stp x22,x21,[sp, #0x1a0]
009fb8b4	stp x20,x19,[sp, #0x1b0]
009fb8b8	stp x29,x30,[sp, #0x1c0]
009fb8bc	add x29,sp,#0x1c0
009fb8c0	stp x1,x2,[sp, #0x28]
009fb8c4	str w10,[sp, #0x24]
009fb8c8	str x0,[sp, #0x18]
009fb8cc	b.lt 0x009fbabc
009fb8d0	sxtw x8,w8
009fb8d4	stp x8,x23,[sp, #0x8]
009fb8d8	sub w8,w23,#0x10
009fb8dc	sxtw x8,w8
009fb8e0	mov w19,w3
009fb8e4	mov x20,xzr
009fb8e8	mov x21,xzr
009fb8ec	mov w0,wzr
009fb8f0	sxtw x24,w23
009fb8f4	mov w22,w23
009fb8f8	mov w27,#0x121
009fb8fc	add x26,sp,#0x44
009fb900	add x8,x8,#0x10
009fb904	str x8,[sp]
009fb908	ldr x8,[sp, #0x30]
009fb90c	ldr w3,[sp, #0x24]
009fb910	adrp x2,0x2af000
009fb914	adrp x4,0x2ab000
009fb918	str w0,[sp, #0x40]
009fb91c	mul w5,w21,w23
009fb920	add x0,sp,#0x44
009fb924	mov w1,#0x121
009fb928	add x2,x2,#0xd07
009fb92c	add x4,x4,#0x32c
009fb930	add x25,x8,w20, SXTW 
009fb934	str w5,[sp, #0x3c]
009fb938	bl 0x00c34d30
009fb93c	mov w28,w0
009fb940	sxtw x8,w28
009fb944	cmp w23,#0x1
009fb948	sub x9,x27,x8
009fb94c	b.lt 0x009fb9b8
009fb950	mov x23,xzr
009fb954	cmp x9,#0x4
009fb958	b.cc 0x009fb9a4
009fb95c	add w9,w20,w23
009fb960	cmp w9,w19
009fb964	b.ge 0x009fb994
009fb968	ldrb w3,[x25, x23]
009fb96c	add x0,x26,x8
009fb970	cmp x23,#0x7
009fb974	mov w8,#0x20
009fb978	mov w9,#0x2d
009fb97c	adrp x2,0x29f000
009fb980	csel w4,w9,w8,eq
009fb984	mov w1,#0x4
009fb988	add x2,x2,#0xf16
009fb98c	bl 0x00c34d30
009fb990	b 0x009fb9a0
009fb994	mov w9,#0x2020
009fb998	movk w9,#0x20, LSL #16
009fb99c	str w9,[x26, x8#0x0]
009fb9a0	add w28,w28,#0x3
009fb9a4	add x23,x23,#0x1
009fb9a8	sxtw x8,w28
009fb9ac	cmp x22,x23
009fb9b0	sub x9,x27,x8
009fb9b4	b.ne 0x009fb954
009fb9b8	cmp x9,#0x3
009fb9bc	b.cc 0x009fb9d4
009fb9c0	add x8,x26,x8
009fb9c4	mov w9,#0x2020
009fb9c8	add w28,w28,#0x2
009fb9cc	strb wzr,[x8, #0x2]
009fb9d0	strh w9,[x8]
009fb9d4	ldr x23,[sp, #0x10]
009fb9d8	sxtw x8,w28
009fb9dc	orr x9,x8,#0x1
009fb9e0	cmp x9,#0x121
009fb9e4	cset w9,eq
009fb9e8	cmp w23,#0x1
009fb9ec	b.lt 0x009fba60
009fb9f0	ldr w10,[sp, #0x3c]
009fb9f4	cmp w10,w19
009fb9f8	b.ge 0x009fba60
009fb9fc	mov x10,xzr
009fba00	tbz w9,#0x0,0x009fba0c
009fba04	sxtw x8,w28
009fba08	b 0x009fba34
009fba0c	ldrb w9,[x25, x10]
009fba10	sxtw x11,w28
009fba14	add x28,x11,#0x1
009fba18	sub w11,w9,#0x20
009fba1c	cmp w11,#0x5f
009fba20	mov w11,#0x2e
009fba24	csel w9,w9,w11,cc
009fba28	strb w9,[x26, x8]
009fba2c	mov x8,x28
009fba30	strb wzr,[x26, x28]
009fba34	orr x9,x8,#0x1
009fba38	add x11,x10,#0x1
009fba3c	cmp x9,#0x121
009fba40	cset w9,eq
009fba44	cmp x11,x24
009fba48	b.ge 0x009fba60
009fba4c	add w10,w20,w10
009fba50	add w10,w10,#0x1
009fba54	cmp w10,w19
009fba58	mov x10,x11
009fba5c	b.lt 0x009fba00
009fba60	cbz w9,0x009fba6c
009fba64	sxtw x1,w28
009fba68	b 0x009fba80
009fba6c	sxtw x9,w28
009fba70	add x1,x9,#0x1
009fba74	mov w9,#0xa
009fba78	strb w9,[x26, x8]
009fba7c	strb wzr,[x26, x1]
009fba80	ldr x2,[sp, #0x28]
009fba84	ldr x8,[sp, #0x18]
009fba88	add x0,sp,#0x44
009fba8c	blr x8
009fba90	tbnz w0,#0x1f,0x009fbac0
009fba94	ldr w8,[sp, #0x40]
009fba98	add x21,x21,#0x1
009fba9c	add w8,w0,w8
009fbaa0	mov w0,w8
009fbaa4	ldr x8,[sp, #0x8]
009fbaa8	cmp x21,x8
009fbaac	ldr x8,[sp]
009fbab0	add x20,x20,x8
009fbab4	b.lt 0x009fb908
009fbab8	b 0x009fbac0
009fbabc	mov w0,wzr
009fbac0	ldp x29,x30,[sp, #0x1c0]
009fbac4	ldp x20,x19,[sp, #0x1b0]
009fbac8	ldp x22,x21,[sp, #0x1a0]
009fbacc	ldp x24,x23,[sp, #0x190]
009fbad0	ldp x26,x25,[sp, #0x180]
009fbad4	ldp x28,x27,[sp, #0x170]
009fbad8	add sp,sp,#0x1d0
009fbadc	ret
