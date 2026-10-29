/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcf4ec..0xbcf724 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcf4ec_2 {
    struct st_bcf4ec_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_bcf4ec_2;

typedef struct st_bcf4ec_0 {
    char padding_0[538];
    unsigned short field_21a;
} st_bcf4ec_0;

typedef struct st_bcf4ec_4 {
    struct st_bcf4ec_4 *field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char padding_20[240];
    uint128_t field_110;
    unsigned long long field_120;
    char padding_128[240];
    unsigned short field_218;
    unsigned short field_21a;
} st_bcf4ec_4;

typedef struct st_bcf4ec_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    char field_20;
    char padding_21[503];
    struct st_bcf4ec_0 *field_218;
    unsigned short field_21a;
    char padding_21c[4];
    unsigned long long field_220;
} st_bcf4ec_1;

extern long long g_ef8ce0;

unsigned long long * sub_bcf4ec(unsigned long long *a0, st_bcf4ec_2 *a1, unsigned long a2)
{
    st_bcf4ec_1 *ptr;  // x20
    unsigned long long v17;  // x23
    unsigned int i;  // w14
    st_bcf4ec_0 *v27;  // x9
    unsigned long long j;  // x8
    unsigned long long v29;  // x8
    unsigned long long *v31;  // x0
    st_bcf4ec_4 *v32;  // x8
    unsigned long long v33;  // x9
    st_bcf4ec_4 *v34;  // x8
    unsigned long long v35;  // x24
    unsigned long long v18;  // x8
    unsigned long long v36;  // x8
    unsigned long long v37;  // x8
    unsigned long long *v38;  // x0
    st_bcf4ec_1 *v19;  // x9
    unsigned long long *v20;  // x11
    unsigned long long v21;  // x12
    unsigned long long v22;  // x13
    unsigned long long v23;  // x10
    unsigned long long *v24;  // x11
    char v25;  // x14
    unsigned long long v0;  // [bp-0x119]
    st_bcf4ec_0 *v1;  // [bp-0x118]
    unsigned long long v2;  // [bp-0x110]
    unsigned long v3;  // [bp-0x108]
    uint128_t v4;  // [bp-0x100]
    uint256_t v5;  // [bp-0xf0]
    uint128_t v6;  // [bp-0xd0], Other Possible Types: char
    uint128_t v7;  // [bp-0xc0]
    uint128_t v8;  // [bp-0xb0]
    st_bcf4ec_4 *v9;  // [bp-0xa0]
    unsigned long v10;  // [bp-0x90]
    st_bcf4ec_1 *v11;  // [bp-0x80], Other Possible Types: uint128_t
    unsigned long long v12;  // [bp-0x78]
    uint256_t v13;  // [bp-0x70], Other Possible Types: unsigned long long
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    ptr = a1->field_0;
    if (ptr)
    {
        v17 = a1->field_8;
        v18 = v17;
        v19 = ptr;
        while (1)
        {
            v20 = &v19->field_8;
            v21 = *(short *)((char *)&v19->field_218 + 2);
            v22 = v21 * 24;
            v23 = 0xffffffffffffffff;
            do
            {
                if (!v22)
                    goto LABEL_bcf570;
                v24 = v20 + 3;
                if (*v20 <= a2)
                    v25 = a2 > *v20;
                else
                    v25 = 0xff;
                v23 += 1;
                v22 -= 24;
                i = v25;
                v20 = v24;
            } while (i == 1);
            v21 = v23;
            if (!i)
            {
                v0 = 0;
                if (v18)
                {
                    v27 = *(long long *)&(&v19->field_21a)[4 * v23];
                    j = v18 - 1;
                    if (v18 != 1)
                    {
                        do
                        {
                            v29 = j;
                            v27 = *(long long *)&v27[1].padding_0[4 + 8 * v27->field_21a];
                            j = v29 - 1;
                        } while (j);
                    }
                    v1 = v27;
                    v2 = 0;
                    v3 = v27->field_21a - 1;
                    v31 = sub_bb0bd4(&v6, &v1, &v0);
                    v4 = v6;
                    v5 = CONCAT(v8, v7);
                    v32 = v9;
                    v33 = v10;
                    if (v10 >= *(short *)&v32->padding_128[226])
                    {
                        do
                        {
                            v33 = *(short *)&v32->padding_128[224];
                            v32 = v32->field_0;
                        } while (*(short *)&v32->padding_128[226] <= (unsigned int)v33);
                    }
                    v34 = &(&v32->field_0)[3 * v33];
                    *(long long *)&v13 = *(long long *)((char *)&v34->field_8 + 8);
                    v11 = *(int128_t *)&(&v34->field_0)[1];
                    *(uint128_t *)&(&v34->field_0)[1] = v4;
                    *(unsigned long long *)((char *)&v34->field_8 + 8) = *(unsigned long long *)&v5;
                    *(int128_t *)((char *)&v13 + 8) = *(int128_t *)&v34->padding_20[232];
                    *(long long *)((char *)&v13 + 24) = v34->field_110;
                    *(unsigned long long *)&v34->field_110 = *(unsigned long long *)((void*)&v5 + 24);
                    *(uint128_t *)&v34->padding_20[232] = *(uint128_t *)((void*)&v5 + 8);
                    v7 = *(uint128_t *)&v13;
                    v8 = *(uint128_t *)((void*)&v13 + 16);
                    v6 = v11;
                }
                else
                {
                    v11 = v19;
                    v12 = 0;
                    v13 = v23;
                    v31 = sub_bb0bd4(&v6, &v11, &v0);
                }
                v35 = *(unsigned long long *)((void*)&v7 + 8);
                a1->field_10 = a1->field_10 - 1;
                if (v0 == 1)
                {
                    if (v17)
                    {
                        v36 = *(long long *)&ptr->field_21a;
                        a1->field_0 = v36;
                        a1->field_8 = v17 - 1;
                        *(unsigned long long *)v36 = 0;
                        v31 = _free(ptr);
                    }
                    else
                    {
                        sub_c73c80("assertion failed: self.height > 0assertion failed: old_right_len + count <= CAPACITYassertion failed: old_left_len >= countassertion failed: old_left_len + count <= CAPACITYassertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n                    ast::RValue::MethodCall(_)))Range s", 33, &g_ef8ce0);
                        __debugbreak();
                    }
                }
                v37 = 0x8000000000000000;
                if (v35 != 0x8000000000000000)
                {
                    a0[1] = v8;
                    a0[2] = *(unsigned long long *)((void*)&v8 + 8);
                    v37 = v35;
                    goto LABEL_bcf6d0;
                }
            }
LABEL_bcf570:
            if (!v18)
                break;
            v19 = *(long long *)&(&v19->field_21a)[4 * v21];
            v18 -= 1;
        }
    }
    v37 = 0x8000000000000000;
    v31 = a0;
LABEL_bcf6d0:
    v38 = v31;
    *a0 = v37;
    return v38;
}
