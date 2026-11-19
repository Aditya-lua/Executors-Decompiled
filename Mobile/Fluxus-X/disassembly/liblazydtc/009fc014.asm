; BIO_read @ 009fc014
009fc014	tbnz w2,#0x1f,0x009fc048
009fc018	sub sp,sp,#0x20
009fc01c	sxtw x2,w2
009fc020	add x3,sp,#0x8
009fc024	stp x29,x30,[sp, #0x10]
009fc028	add x29,sp,#0x10
009fc02c	bl 0x009fc050
009fc030	ldr w8,[sp, #0x8]
009fc034	ldp x29,x30,[sp, #0x10]
009fc038	cmp w0,#0x0
009fc03c	csel w0,w8,w0,gt
009fc040	add sp,sp,#0x20
009fc044	ret
009fc048	mov w0,wzr
009fc04c	ret
