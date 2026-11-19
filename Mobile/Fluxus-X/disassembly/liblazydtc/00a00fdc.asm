; BIO_sock_should_retry @ 00a00fdc
00a00fdc	add w8,w0,#0x1
00a00fe0	cmp w8,#0x1
00a00fe4	mov w0,wzr
00a00fe8	b.hi 0x00a01038
00a00fec	stp x29,x30,[sp, #-0x10]!
00a00ff0	mov x29,sp
00a00ff4	bl 0x00c30710
00a00ff8	ldr w8,[x0]
00a00ffc	mov w0,#0x1
00a01000	sub w9,w8,#0x47
00a01004	cmp w9,#0x2c
00a01008	ldp x29,x30,[sp], #0x10
00a0100c	b.hi 0x00a01028
00a01010	mov w10,#0x1
00a01014	lsl x9,x10,x9
00a01018	mov x10,#0x100000001
00a0101c	movk x10,#0x1810, LSL #32
00a01020	tst x9,x10
00a01024	b.ne 0x00a01038
00a01028	cmp w8,#0x4
00a0102c	b.eq 0x00a01038
00a01030	cmp w8,#0xb
00a01034	b.ne 0x00a0103c
00a01038	ret
00a0103c	mov w0,wzr
00a01040	ret
