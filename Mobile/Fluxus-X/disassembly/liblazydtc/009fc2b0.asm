; BIO_read_ex @ 009fc2b0
009fc2b0	stp x29,x30,[sp, #-0x10]!
009fc2b4	mov x29,sp
009fc2b8	bl 0x009fc050
009fc2bc	cmp w0,#0x0
009fc2c0	cset w0,gt
009fc2c4	ldp x29,x30,[sp], #0x10
009fc2c8	ret
