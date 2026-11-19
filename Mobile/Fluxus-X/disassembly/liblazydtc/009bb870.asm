; SSL_use_PrivateKey @ 009bb870
009bb870	cbz x1,0x009bb87c
009bb874	ldr x0,[x0, #0x898]
009bb878	b 0x009bb8c0
009bb87c	stp x29,x30,[sp, #-0x10]!
009bb880	mov x29,sp
009bb884	bl 0x00c342a0
009bb888	adrp x0,0x2db000
009bb88c	adrp x2,0x2b3000
009bb890	add x0,x0,#0xaec
009bb894	add x2,x2,#0xdfd
009bb898	mov w1,#0x8f
009bb89c	bl 0x00c342b0
009bb8a0	mov w1,#0x102
009bb8a4	mov w0,#0x14
009bb8a8	movk w1,#0xc, LSL #16
009bb8ac	mov x2,xzr
009bb8b0	bl 0x00c342c0
009bb8b4	mov w0,wzr
009bb8b8	ldp x29,x30,[sp], #0x10
009bb8bc	ret
