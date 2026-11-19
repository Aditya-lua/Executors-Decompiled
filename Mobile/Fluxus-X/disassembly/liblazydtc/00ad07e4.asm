; RSA_blinding_on @ 00ad07e4
00ad07e4	stp x20,x19,[sp, #-0x20]!
00ad07e8	stp x29,x30,[sp, #0x10]
00ad07ec	mov x19,x0
00ad07f0	ldr x0,[x0, #0xc0]
00ad07f4	mov x20,x1
00ad07f8	add x29,sp,#0x10
00ad07fc	cbz x0,0x00ad0818
00ad0800	bl 0x00c38970
00ad0804	ldr w8,[x19, #0xa4]
00ad0808	str xzr,[x19, #0xc0]
00ad080c	and w8,w8,#0xfffffff7
00ad0810	orr w8,w8,#0x80
00ad0814	str w8,[x19, #0xa4]
00ad0818	mov x0,x19
00ad081c	mov x1,x20
00ad0820	bl 0x00ad084c
00ad0824	str x0,[x19, #0xc0]
00ad0828	cbz x0,0x00ad0840
00ad082c	ldr w8,[x19, #0xa4]
00ad0830	mov w0,#0x1
00ad0834	and w8,w8,#0xffffff7f
00ad0838	orr w8,w8,#0x8
00ad083c	str w8,[x19, #0xa4]
00ad0840	ldp x29,x30,[sp, #0x10]
00ad0844	ldp x20,x19,[sp], #0x20
00ad0848	ret
