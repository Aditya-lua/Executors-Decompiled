; evp_keymgmt_util_cache_keyinfo @ 00a65640
00a65640	ldr x8,[x0, #0x68]
00a65644	cbz x8,0x00a65744
00a65648	sub sp,sp,#0x110
00a6564c	stp x20,x19,[sp, #0xf0]
00a65650	stp x29,x30,[sp, #0x100]
00a65654	add x29,sp,#0x100
00a65658	mov x19,x0
00a6565c	adrp x0,0x2ad000
00a65660	add x0,x0,#0xc98
00a65664	add x8,sp,#0x8
00a65668	sub x1,x29,#0x24
00a6566c	str x28,[sp, #0xe0]
00a65670	add x20,sp,#0x30
00a65674	stur xzr,[x29, #-0x28]
00a65678	stur wzr,[x29, #-0x2c]
00a6567c	bl 0x00c36260
00a65680	ldr x8,[sp, #0x28]
00a65684	ldur q0,[sp, #0x18]
00a65688	ldur q1,[sp, #0x8]
00a6568c	adrp x0,0x2b0000
00a65690	str x8,[sp, #0x50]
00a65694	add x0,x0,#0x16
00a65698	add x8,sp,#0x8
00a6569c	sub x1,x29,#0x28
00a656a0	stp q1,q0,[sp, #0x30]
00a656a4	bl 0x00c36260
00a656a8	ldr x8,[sp, #0x28]
00a656ac	ldur q0,[sp, #0x18]
00a656b0	ldur q1,[sp, #0x8]
00a656b4	adrp x0,0x2a4000
00a656b8	str x8,[sp, #0x78]
00a656bc	add x0,x0,#0x8d
00a656c0	add x8,sp,#0x8
00a656c4	sub x1,x29,#0x2c
00a656c8	stur q0,[sp, #0x68]
00a656cc	stur q1,[sp, #0x58]
00a656d0	bl 0x00c36260
00a656d4	ldr x8,[sp, #0x28]
00a656d8	ldur q0,[sp, #0x18]
00a656dc	ldur q1,[sp, #0x8]
00a656e0	str x8,[sp, #0xa0]
00a656e4	add x8,sp,#0x8
00a656e8	str q0,[x20, #0x60]
00a656ec	str q1,[sp, #0x80]
00a656f0	bl 0x00c34c40
00a656f4	ldr x8,[sp, #0x28]
00a656f8	ldur q0,[sp, #0x18]
00a656fc	ldur q1,[sp, #0x8]
00a65700	add x2,sp,#0x30
00a65704	str x8,[sp, #0xc8]
00a65708	stur q0,[x20, #0x88]
00a6570c	stur q1,[x20, #0x78]
00a65710	ldp x0,x1,[x19, #0x60]
00a65714	bl 0x00c3d380
00a65718	cbz w0,0x00a65734
00a6571c	ldur w8,[x29, #-0x2c]
00a65720	str w8,[x19, #0x90]
00a65724	ldur w8,[x29, #-0x24]
00a65728	str w8,[x19, #0x88]
00a6572c	ldur w8,[x29, #-0x28]
00a65730	str w8,[x19, #0x8c]
00a65734	ldp x29,x30,[sp, #0x100]
00a65738	ldp x20,x19,[sp, #0xf0]
00a6573c	ldr x28,[sp, #0xe0]
00a65740	add sp,sp,#0x110
00a65744	ret
