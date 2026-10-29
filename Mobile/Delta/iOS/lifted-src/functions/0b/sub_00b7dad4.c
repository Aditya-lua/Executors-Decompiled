/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7dad4..0xb7de54 (896 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b7dad4(void* a0, void* a1)
{
    unsigned long v13;  // x8
    uint128_t v14;  // q0
    unsigned long v23;  // x20
    unsigned long long v24;  // 4102
    unsigned long v25;  // x0
    unsigned long long v26;  // x8
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4121
    unsigned long long v29;  // x9
    unsigned long long *v30;  // q1
    uint128_t v31;  // q1
    unsigned long long v32;  // x22
    unsigned long long v15;  // 4102
    unsigned long long *v33;  // x20
    unsigned long long v34;  // x23
    unsigned long long i;  // x26
    unsigned long long *v36;  // x8
    unsigned long long *v38;  // x9
    unsigned long long v40;  // x0
    unsigned long long v41;  // x24
    unsigned long long *v42;  // x21
    unsigned long long v16;  // x20
    unsigned long long v43;  // x8
    unsigned long long v44;  // 4110
    unsigned long long v45;  // 4102
    unsigned long long v46;  // 4110
    unsigned long long v47;  // 4102
    unsigned long v17;  // x22
    unsigned long v18;  // x20
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    uint128_t v0;  // [bp-0xf0]
    unsigned long long v1;  // [bp-0xe0]
    uint128_t v2;  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    unsigned long v4;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long *v5;  // [bp-0xa8]
    unsigned long long v6;  // [bp-0xa0]
    unsigned long v7;  // [bp-0x98]
    unsigned long v8;  // [bp-0x90]
    unsigned long long *v9;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = *(long long *)a1;
    if ((long long)v13 > 7)
    {
        if (v13 == 8)
        {
            sub_b7fa90(a0, (long long)a1[8], (char)a1[16]);
        }
        else if (v13 != 9)
        {
            if (v13 != 10)
            {
                v30 = (unsigned long long *)(int128_t)a1[16];
                *(int128_t *)a0 = *(int128_t *)a1;
                *(uint128_t *)&a0[16] = (uint128_t)v30;
                v14 = (int128_t)a1[32];
                v31 = (int128_t)a1[48];
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v31;
                return *(unsigned long long *)&v14;
            }
            v2 = (int128_t)a1[8];
            v3 = (int128_t)a1[24];
            *(char *)&a0[16] = 1;
            v14 = 0x80000000000000010000000000000006;
            *(uint128_t *)a0 = 0x80000000000000010000000000000006;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v15 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v15 & 1))
            {
                /* unsupported instruction */;
                sub_b86ac8((char *)&v3 + 8);
            }
            v16 = 0;
            v17 = *(unsigned long long *)&v3;
            while (1)
            {
                v18 = v16;
                v19 = 4;
                v20 = v18;
                v21 = v17;
                v22 = 0;
                if (v18 == v17)
                    break;
                v23 = v18 + 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v24 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                v16 = v23;
                if (!(v24 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(*(long long *)(*(unsigned long long *)((void*)&v2 + 8) + v18 * 16 + 8));
                    v16 = v23;
                }
            }
            if (*(unsigned long long *)&v2)
            {
                v25 = *(unsigned long long *)((void*)&v2 + 8);
                v14 = 0x80000000000000010000000000000006;
LABEL_b7dd48:
                _free(v25);
            }
        }
        else
        {
            v14 = (int128_t)a1[8];
            v0 = v14;
            v1 = (long long)a1[24];
            sub_b963e4(a0, &v0);
        }
    }
    else
    {
        if (v13 != 5)
        {
            if (v13 != 6)
            {
                v30 = (unsigned long long *)(int128_t)a1[16];
                *(int128_t *)a0 = *(int128_t *)a1;
                *(uint128_t *)&a0[16] = (uint128_t)v30;
                v14 = (int128_t)a1[32];
                v31 = (int128_t)a1[48];
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v31;
                return *(unsigned long long *)&v14;
            }
            v26 = (long long)a1[8];
            v25 = (long long)a1[16];
            v27 = v26 ^ 0x8000000000000000;
            v28 = arm64g_calculate_condition(0x44, v26, 0, 0);
            if (!(v28 & 1))
                v27 = 4;
            if (!v27)
                v29 = 0;
            else
                v29 = (char)v25;
            if (4 > v27 - 2)
                v29 = 1;
            *(char *)&a0[16] = v29 & 1;
            v14 = 0x80000000000000010000000000000006;
            *(uint128_t *)a0 = 0x80000000000000010000000000000006;
            v19 = 4;
            v20 = v26;
            v21 = 1;
            v22 = 0;
            if (1 <= (long long)v26)
                goto LABEL_b7dd48;
        }
        else
        {
            v32 = (long long)a1[8];
            v33 = (long long)a1[16];
            v34 = (long long)a1[24];
            v8 = 2;
            v9 = v33;
            v10 = &v33[16 * v34];
            v36 = v33;
            while (i)
            {
                v38 = v36;
                if (*v38 == 12)
                    v36 = 0;
                v4 = 1;
                v5 = v36;
                v6 = 1;
                v7 = v38 + 8;
                i -= 128;
                v36 += 16;
                if (sub_b8a3c0() & 1)
                    goto LABEL_b7dcdc;
            }
            v9 = v10;
            v4 = 2;
            if (v8 != 2 && (v40 = sub_b8a3c0(&v8), sub_b8a3c0(&v8) & 1))
            {
LABEL_b7dcdc:
                *(unsigned long long **)&a0[16] = v33;
                *(unsigned long long *)&a0[24] = v34;
                *(unsigned long long *)a0 = 5;
                *(unsigned long long *)&a0[8] = v32;
                goto LABEL_b7dd4c;
            }
            v41 = 0;
            *(char *)&a0[16] = 1;
            v14 = 0x80000000000000010000000000000006;
            *(uint128_t *)a0 = 0x80000000000000010000000000000006;
            v42 = v33;
            while (1)
            {
                v19 = 4;
                v20 = v34;
                v21 = v41;
                v22 = 0;
                if (v34 == v41)
                    break;
                v41 += 1;
                if (*v42 != 12)
                    sub_b728e8(v42);
                sub_b728e8(v42 + 8);
                v42 += 16;
            }
            if (v32)
            {
                v25 = v33;
                goto LABEL_b7dd48;
            }
        }
    }
LABEL_b7dd4c:
    v43 = 1 << ((char)*(long long *)a1 & 63) & 1888;
    if ((unsigned long long)*(long long *)a1 <= 10)
    {
        v44 = arm64g_calculate_condition(v19 | 144, v20, v21, v22);
        v45 = arm64g_calculate_condition(4, (v44 & 1 ? v43 : 0x40000000), 0, 0);
        if (v45 & 1)
        {
            sub_b7d588();
            return *(unsigned long long *)&v14;
        }
        return *(unsigned long long *)&v14;
    }
    else
    {
        v46 = arm64g_calculate_condition(v19 | 144, v20, v21, v22);
        v47 = arm64g_calculate_condition(0, (v46 & 1 ? v43 : 0x40000000), 0, 0);
        if (v47 & 1)
        {
            sub_b7d588();
            return *(unsigned long long *)&v14;
        }
        return *(unsigned long long *)&v14;
    }
}
