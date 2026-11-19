; std::__ndk1::time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::put @ 00bec760
00bec760	paciasp
00bec764	sub sp,sp,#0x90
00bec768	stp x29,x30,[sp, #0x30]
00bec76c	stp x28,x27,[sp, #0x40]
00bec770	stp x26,x25,[sp, #0x50]
00bec774	stp x24,x23,[sp, #0x60]
00bec778	stp x22,x21,[sp, #0x70]
00bec77c	stp x20,x19,[sp, #0x80]
00bec780	add x29,sp,#0x30
00bec784	mov x24,x0
00bec788	add x8,sp,#0x10
00bec78c	mov x0,x2
00bec790	mov x20,x6
00bec794	mov x25,x5
00bec798	str x4,[sp, #0x8]
00bec79c	mov w22,w3
00bec7a0	mov x23,x2
00bec7a4	mov x19,x1
00bec7a8	bl 0x00c30070
00bec7ac	adrp x27,0xcb5000
00bec7b0	ldr x27,[x27, #0xb98]
00bec7b4	ldr x26,[sp, #0x10]
00bec7b8	str x27,[sp, #0x18]
00bec7bc	ldar x8,[x27]
00bec7c0	cmn x8,#0x1
00bec7c4	b.eq 0x00bec7ec
00bec7c8	add x8,sp,#0x18
00bec7cc	sub x9,x29,#0x8
00bec7d0	stp x9,x8,[x29, #-0x10]
00bec7d4	adrp x0,0xcb5000
00bec7d8	nop
00bec7dc	adr x2,0xc0bab0
00bec7e0	ldr x0,[x0, #0xb98]
00bec7e4	sub x1,x29,#0x10
00bec7e8	bl 0x00c305d0
00bec7ec	ldp x8,x10,[x26, #0x10]
00bec7f0	ldrsw x9,[x27, #0x8]
00bec7f4	sub x9,x9,#0x1
00bec7f8	sub x10,x10,x8
00bec7fc	cmp x9,x10, ASR #0x3
00bec800	b.cs 0x00bec9f4
00bec804	ldr x26,[x8, x9, LSL #0x3]
00bec808	cbz x26,0x00bec9f4
00bec80c	add x0,sp,#0x10
00bec810	bl 0x00c30090
00bec814	cmp x25,x20
00bec818	b.ne 0x00bec83c
00bec81c	b 0x00bec9a8
00bec820	str w1,[x8], #0x4
00bec824	str x8,[x19, #0x30]
00bec828	cmn w1,#0x1
00bec82c	csel x19,xzr,x19,eq
00bec830	add x25,x25,#0x4
00bec834	cmp x25,x20
00bec838	b.eq 0x00bec9a8
00bec83c	ldr x8,[x26]
00bec840	ldr w1,[x25]
00bec844	mov x0,x26
00bec848	mov w2,wzr
00bec84c	ldr x8,[x8, #0x68]
00bec850	blr x8
00bec854	and w8,w0,#0xff
00bec858	cmp w8,#0x25
00bec85c	b.ne 0x00bec8cc
00bec860	add x21,x25,#0x4
00bec864	cmp x21,x20
00bec868	b.eq 0x00bec938
00bec86c	ldr x8,[x26]
00bec870	ldr w1,[x21]
00bec874	mov x0,x26
00bec878	mov w2,wzr
00bec87c	ldr x8,[x8, #0x68]
00bec880	blr x8
00bec884	and w8,w0,#0xff
00bec888	mov w27,w0
00bec88c	cmp w8,#0x4f
00bec890	b.eq 0x00bec89c
00bec894	cmp w8,#0x45
00bec898	b.ne 0x00bec8f8
00bec89c	add x28,x25,#0x8
00bec8a0	cmp x28,x20
00bec8a4	b.eq 0x00bec958
00bec8a8	ldr x8,[x26]
00bec8ac	ldr w1,[x28]
00bec8b0	mov x0,x26
00bec8b4	mov w2,wzr
00bec8b8	ldr x8,[x8, #0x68]
00bec8bc	blr x8
00bec8c0	mov w5,w0
00bec8c4	mov x21,x28
00bec8c8	b 0x00bec900
00bec8cc	cbz x19,0x00bec830
00bec8d0	ldp x8,x9,[x19, #0x30]
00bec8d4	ldr w1,[x25]
00bec8d8	cmp x8,x9
00bec8dc	b.ne 0x00bec820
00bec8e0	ldr x8,[x19]
00bec8e4	mov x0,x19
00bec8e8	ldr x8,[x8, #0x68]
00bec8ec	blr x8
00bec8f0	mov w1,w0
00bec8f4	b 0x00bec828
00bec8f8	mov w5,w27
00bec8fc	mov w27,wzr
00bec900	ldr x8,[x24]
00bec904	ldr x4,[sp, #0x8]
00bec908	mov x0,x24
00bec90c	mov x1,x19
00bec910	mov x2,x23
00bec914	mov w3,w22
00bec918	ldr x8,[x8, #0x18]
00bec91c	mov w6,w27
00bec920	blr x8
00bec924	mov x19,x0
00bec928	add x25,x21,#0x4
00bec92c	cmp x25,x20
00bec930	b.ne 0x00bec83c
00bec934	b 0x00bec9a8
00bec938	cbz x19,0x00bec9a8
00bec93c	ldp x8,x9,[x19, #0x30]
00bec940	ldr w1,[x25]
00bec944	cmp x8,x9
00bec948	b.eq 0x00bec98c
00bec94c	str w1,[x8], #0x4
00bec950	str x8,[x19, #0x30]
00bec954	b 0x00bec9a0
00bec958	cbz x19,0x00bec9a8
00bec95c	ldp x8,x9,[x19, #0x30]
00bec960	ldr w1,[x25]
00bec964	cmp x8,x9
00bec968	b.eq 0x00bec9d0
00bec96c	str w1,[x8], #0x4
00bec970	str x8,[x19, #0x30]
00bec974	cmn w1,#0x1
00bec978	b.eq 0x00bec9ec
00bec97c	ldp x8,x9,[x19, #0x30]
00bec980	ldr w1,[x21]
00bec984	cmp x8,x9
00bec988	b.ne 0x00bec94c
00bec98c	ldr x8,[x19]
00bec990	mov x0,x19
00bec994	ldr x8,[x8, #0x68]
00bec998	blr x8
00bec99c	mov w1,w0
00bec9a0	cmn w1,#0x1
00bec9a4	csel x19,xzr,x19,eq
00bec9a8	mov x0,x19
00bec9ac	ldp x20,x19,[sp, #0x80]
00bec9b0	ldp x22,x21,[sp, #0x70]
00bec9b4	ldp x24,x23,[sp, #0x60]
00bec9b8	ldp x26,x25,[sp, #0x50]
00bec9bc	ldp x28,x27,[sp, #0x40]
00bec9c0	ldp x29,x30,[sp, #0x30]
00bec9c4	add sp,sp,#0x90
00bec9c8	autiasp
00bec9cc	ret
00bec9d0	ldr x8,[x19]
00bec9d4	mov x0,x19
00bec9d8	ldr x8,[x8, #0x68]
00bec9dc	blr x8
00bec9e0	mov w1,w0
00bec9e4	cmn w1,#0x1
00bec9e8	b.ne 0x00bec97c
00bec9ec	mov x19,xzr
00bec9f0	b 0x00bec9a8
00bec9f4	bl 0x00bd8968
