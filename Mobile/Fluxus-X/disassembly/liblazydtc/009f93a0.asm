; ASYNC_pause_job @ 009f93a0
009f93a0	stp x29,x30,[sp, #-0x10]!
009f93a4	adrp x0,0xd21000
009f93a8	add x0,x0,#0x8e8
009f93ac	mov x29,sp
009f93b0	bl 0x00c38360
009f93b4	cbz x0,0x009f93d4
009f93b8	ldr x8,[x0, #0x8]
009f93bc	cbz x8,0x009f93e0
009f93c0	ldr w9,[x0, #0x10]
009f93c4	mov w0,#0x1
009f93c8	cbz w9,0x009f93ec
009f93cc	ldp x29,x30,[sp], #0x10
009f93d0	ret
009f93d4	mov w0,#0x1
009f93d8	ldp x29,x30,[sp], #0x10
009f93dc	ret
009f93e0	mov w0,#0x1
009f93e4	ldp x29,x30,[sp], #0x10
009f93e8	ret
009f93ec	str w0,[x8, #0x1c]
009f93f0	bl 0x00c342a0
009f93f4	adrp x0,0x29d000
009f93f8	adrp x2,0x2b9000
009f93fc	add x0,x0,#0xf33
009f9400	add x2,x2,#0xb4a
009f9404	mov w1,#0x137
009f9408	bl 0x00c342b0
009f940c	mov w0,#0x33
009f9410	mov w1,#0x66
009f9414	mov x2,xzr
009f9418	bl 0x00c342c0
009f941c	mov w0,wzr
009f9420	ldp x29,x30,[sp], #0x10
009f9424	ret
