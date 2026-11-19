; FUN_00b5b718 @ 00b5b718
00b5b718	stp x20,x19,[sp, #-0x20]!
00b5b71c	stp x29,x30,[sp, #0x10]
00b5b720	ldr w8,[x0, #0xc]
00b5b724	mov x20,x0
00b5b728	mov w0,wzr
00b5b72c	add x29,sp,#0x10
00b5b730	cmp w8,w3
00b5b734	b.cc 0x00b5b778
00b5b738	ldp x9,x8,[x20, #0x28]
00b5b73c	mov x19,x2
00b5b740	mov w0,wzr
00b5b744	sub x9,x9,x8
00b5b748	cmp x9,x2
00b5b74c	b.cc 0x00b5b778
00b5b750	ldr x9,[x20, #0x18]
00b5b754	mov x0,x1
00b5b758	mov x2,x19
00b5b75c	add x8,x9,x8
00b5b760	mov x1,x8
00b5b764	bl 0x00c2ffd0
00b5b768	ldr x8,[x20, #0x30]
00b5b76c	mov w0,#0x1
00b5b770	add x8,x8,x19
00b5b774	str x8,[x20, #0x30]
00b5b778	ldp x29,x30,[sp, #0x10]
00b5b77c	ldp x20,x19,[sp], #0x20
00b5b780	ret
