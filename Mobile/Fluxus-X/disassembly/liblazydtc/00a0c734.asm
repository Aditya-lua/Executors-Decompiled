; CONF_modules_unload @ 00a0c734
00a0c734	str x25,[sp, #-0x50]!
00a0c738	stp x24,x23,[sp, #0x10]
00a0c73c	stp x22,x21,[sp, #0x20]
00a0c740	stp x20,x19,[sp, #0x30]
00a0c744	stp x29,x30,[sp, #0x40]
00a0c748	add x29,sp,#0x40
00a0c74c	mov w19,w0
00a0c750	bl 0x00a0c850
00a0c754	cbz w0,0x00a0c838
00a0c758	adrp x23,0xd21000
00a0c75c	ldr x0,[x23, #0x928]
00a0c760	bl 0x00c356a0
00a0c764	cbz w0,0x00a0c838
00a0c768	adrp x24,0xd21000
00a0c76c	ldr x0,[x24, #0x930]
00a0c770	bl 0x00c325e0
00a0c774	ldr x8,[x24, #0x930]
00a0c778	cmp w0,#0x1
00a0c77c	b.lt 0x00a0c804
00a0c780	adrp x20,0x2c9000
00a0c784	add w25,w0,#0x1
00a0c788	add x20,x20,#0x604
00a0c78c	sub w22,w25,#0x2
00a0c790	mov x0,x8
00a0c794	mov w1,w22
00a0c798	bl 0x00c32610
00a0c79c	ldr w8,[x0, #0x20]
00a0c7a0	mov x21,x0
00a0c7a4	cmp w8,#0x1
00a0c7a8	b.lt 0x00a0c7e8
00a0c7ac	cbz w19,0x00a0c7f4
00a0c7b0	ldr x0,[x24, #0x930]
00a0c7b4	mov w1,w22
00a0c7b8	bl 0x00c35320
00a0c7bc	ldr x0,[x21]
00a0c7c0	bl 0x00c39560
00a0c7c4	ldr x0,[x21, #0x8]
00a0c7c8	mov w2,#0x205
00a0c7cc	mov x1,x20
00a0c7d0	bl 0x00c32310
00a0c7d4	mov w2,#0x206
00a0c7d8	mov x0,x21
00a0c7dc	mov x1,x20
00a0c7e0	bl 0x00c32310
00a0c7e4	b 0x00a0c7f4
00a0c7e8	cbnz w19,0x00a0c7b0
00a0c7ec	ldr x8,[x21]
00a0c7f0	cbnz x8,0x00a0c7b0
00a0c7f4	ldr x8,[x24, #0x930]
00a0c7f8	sub w25,w25,#0x1
00a0c7fc	cmp w25,#0x1
00a0c800	b.gt 0x00a0c78c
00a0c804	mov x0,x8
00a0c808	bl 0x00c325e0
00a0c80c	cbnz w0,0x00a0c81c
00a0c810	ldr x0,[x24, #0x930]
00a0c814	bl 0x00c34770
00a0c818	str xzr,[x24, #0x930]
00a0c81c	ldr x0,[x23, #0x928]
00a0c820	ldp x29,x30,[sp, #0x40]
00a0c824	ldp x20,x19,[sp, #0x30]
00a0c828	ldp x22,x21,[sp, #0x20]
00a0c82c	ldp x24,x23,[sp, #0x10]
00a0c830	ldr x25,[sp], #0x50
00a0c834	b 0x00c35690
00a0c838	ldp x29,x30,[sp, #0x40]
00a0c83c	ldp x20,x19,[sp, #0x30]
00a0c840	ldp x22,x21,[sp, #0x20]
00a0c844	ldp x24,x23,[sp, #0x10]
00a0c848	ldr x25,[sp], #0x50
00a0c84c	ret
