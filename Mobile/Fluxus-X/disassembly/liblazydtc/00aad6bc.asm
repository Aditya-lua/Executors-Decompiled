; OBJ_NAME_remove @ 00aad6bc
00aad6bc	sub sp,sp,#0x50
00aad6c0	stp x20,x19,[sp, #0x30]
00aad6c4	mov w19,w1
00aad6c8	mov x20,x0
00aad6cc	adrp x0,0xd22000
00aad6d0	adrp x1,0xaad000
00aad6d4	add x0,x0,#0x160
00aad6d8	add x1,x1,#0x21c
00aad6dc	stp x22,x21,[sp, #0x20]
00aad6e0	stp x29,x30,[sp, #0x40]
00aad6e4	add x29,sp,#0x40
00aad6e8	bl 0x00c34d60
00aad6ec	mov w21,wzr
00aad6f0	cbz w0,0x00aad798
00aad6f4	adrp x8,0xd22000
00aad6f8	ldr w8,[x8, #0x164]
00aad6fc	cbz w8,0x00aad798
00aad700	adrp x22,0xd22000
00aad704	ldr x0,[x22, #0x168]
00aad708	bl 0x00c356a0
00aad70c	cbz w0,0x00aad784
00aad710	adrp x8,0xd22000
00aad714	ldr x0,[x8, #0x178]
00aad718	and w8,w19,#0xffff7fff
00aad71c	add x1,sp,#0x8
00aad720	str x20,[sp, #0x10]
00aad724	str w8,[sp, #0x8]
00aad728	bl 0x00c36010
00aad72c	cbz x0,0x00aad78c
00aad730	adrp x20,0xd22000
00aad734	mov x19,x0
00aad738	ldr x0,[x20, #0x170]
00aad73c	cbz x0,0x00aad768
00aad740	bl 0x00c325e0
00aad744	ldr w1,[x19]
00aad748	cmp w0,w1
00aad74c	b.le 0x00aad768
00aad750	ldr x0,[x20, #0x170]
00aad754	bl 0x00c32610
00aad758	ldr x8,[x0, #0x10]
00aad75c	ldr w1,[x19]
00aad760	ldp x0,x2,[x19, #0x8]
00aad764	blr x8
00aad768	adrp x1,0x2b2000
00aad76c	add x1,x1,#0x57b
00aad770	mov w2,#0x10e
00aad774	mov x0,x19
00aad778	bl 0x00c32310
00aad77c	mov w21,#0x1
00aad780	b 0x00aad790
00aad784	mov w21,wzr
00aad788	b 0x00aad798
00aad78c	mov w21,wzr
00aad790	ldr x0,[x22, #0x168]
00aad794	bl 0x00c35690
00aad798	mov w0,w21
00aad79c	ldp x29,x30,[sp, #0x40]
00aad7a0	ldp x20,x19,[sp, #0x30]
00aad7a4	ldp x22,x21,[sp, #0x20]
00aad7a8	add sp,sp,#0x50
00aad7ac	ret
