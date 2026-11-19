; SSL_add_dir_cert_subjects_to_stack @ 009ad528
009ad528	stp x28,x23,[sp, #-0x40]!
009ad52c	stp x22,x21,[sp, #0x10]
009ad530	stp x20,x19,[sp, #0x20]
009ad534	stp x29,x30,[sp, #0x30]
009ad538	add x29,sp,#0x30
009ad53c	sub sp,sp,#0x490
009ad540	mov x20,x0
009ad544	sub x0,x29,#0x38
009ad548	mov x19,x1
009ad54c	stur xzr,[x29, #-0x38]
009ad550	bl 0x00c34da0
009ad554	cbz x0,0x009ad5f4
009ad558	adrp x21,0x2a5000
009ad55c	mov x22,x0
009ad560	add x21,x21,#0x600
009ad564	mov x0,x19
009ad568	bl 0x00c2ff50
009ad56c	mov x23,x0
009ad570	mov x0,x22
009ad574	bl 0x00c2ff50
009ad578	add x8,x23,x0
009ad57c	add x8,x8,#0x2
009ad580	cmp x8,#0x401
009ad584	b.cs 0x009ad674
009ad588	add x0,sp,#0x88
009ad58c	mov w1,#0x400
009ad590	mov x2,x21
009ad594	mov x3,x19
009ad598	mov x4,x22
009ad59c	bl 0x00c34d30
009ad5a0	mov w22,w0
009ad5a4	add x0,sp,#0x88
009ad5a8	add x1,sp,#0x8
009ad5ac	bl 0x00c30400
009ad5b0	cbnz w0,0x009ad5c4
009ad5b4	ldr w8,[sp, #0x18]
009ad5b8	and w8,w8,#0xf000
009ad5bc	cmp w8,#0x4, LSL #12
009ad5c0	b.eq 0x009ad5e0
009ad5c4	sub w8,w22,#0x1
009ad5c8	cmp w8,#0x3ff
009ad5cc	b.cs 0x009ad6a0
009ad5d0	add x1,sp,#0x88
009ad5d4	mov x0,x20
009ad5d8	bl 0x009ad3e4
009ad5dc	cbz w0,0x009ad6a0
009ad5e0	sub x0,x29,#0x38
009ad5e4	mov x1,x19
009ad5e8	bl 0x00c34da0
009ad5ec	mov x22,x0
009ad5f0	cbnz x0,0x009ad564
009ad5f4	bl 0x00c30710
009ad5f8	ldr w8,[x0]
009ad5fc	cbz w8,0x009ad664
009ad600	mov x20,x0
009ad604	bl 0x00c342a0
009ad608	adrp x21,0x2d5000
009ad60c	adrp x22,0x2d5000
009ad610	add x21,x21,#0x6b3
009ad614	add x22,x22,#0x6c2
009ad618	mov w1,#0x319
009ad61c	mov x0,x21
009ad620	mov x2,x22
009ad624	bl 0x00c342b0
009ad628	ldr w1,[x20]
009ad62c	adrp x2,0x2b1000
009ad630	add x2,x2,#0xd02
009ad634	mov w0,#0x2
009ad638	mov x3,x19
009ad63c	bl 0x00c342c0
009ad640	bl 0x00c342a0
009ad644	mov w1,#0x31b
009ad648	mov x0,x21
009ad64c	mov x2,x22
009ad650	bl 0x00c342b0
009ad654	mov w1,#0x2
009ad658	mov w0,#0x14
009ad65c	movk w1,#0x8, LSL #16
009ad660	b 0x009ad698
009ad664	mov w19,#0x1
009ad668	ldur x8,[x29, #-0x38]
009ad66c	cbnz x8,0x009ad6ac
009ad670	b 0x009ad6b4
009ad674	bl 0x00c342a0
009ad678	adrp x0,0x2d5000
009ad67c	adrp x2,0x2d5000
009ad680	add x0,x0,#0x6b3
009ad684	add x2,x2,#0x6c2
009ad688	mov w1,#0x305
009ad68c	bl 0x00c342b0
009ad690	mov w0,#0x14
009ad694	mov w1,#0x10e
009ad698	mov x2,xzr
009ad69c	bl 0x00c342c0
009ad6a0	mov w19,wzr
009ad6a4	ldur x8,[x29, #-0x38]
009ad6a8	cbz x8,0x009ad6b4
009ad6ac	sub x0,x29,#0x38
009ad6b0	bl 0x00c34d90
009ad6b4	mov w0,w19
009ad6b8	add sp,sp,#0x490
009ad6bc	ldp x29,x30,[sp, #0x30]
009ad6c0	ldp x20,x19,[sp, #0x20]
009ad6c4	ldp x22,x21,[sp, #0x10]
009ad6c8	ldp x28,x23,[sp], #0x40
009ad6cc	ret
