/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadb158..0xadbc60 (2824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adb158_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_adb158_0;

extern st_adb158_0 g_df9bc8;

void* sub_adb158(void* a0, void* iter, unsigned long long i)
{
    unsigned long long v9;  // x10
    unsigned long v10;  // x11
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long v19;  // 4110
    unsigned long long v20;  // 4109
    unsigned long long v21;  // x2
    uint128_t v22;  // q0
    uint128_t v23;  // q1
    uint128_t v24;  // q2
    unsigned long v25;  // x14
    unsigned long v26;  // x6
    unsigned long long j;  // x13
    unsigned long v28;  // x5
    unsigned long v29;  // x4
    unsigned long v30;  // x3
    unsigned long v31;  // x17
    unsigned long v32;  // x15
    unsigned long v33;  // x16
    unsigned long v34;  // x7
    unsigned long v35;  // x6
    unsigned long v36;  // x5
    unsigned long v37;  // x4
    unsigned long v38;  // x3
    unsigned long v39;  // x17
    unsigned long v40;  // x15
    unsigned long v41;  // x16
    unsigned long long v42;  // x23
    unsigned long long v43;  // x25
    unsigned long long v44;  // x24
    unsigned long long v45;  // x22
    unsigned long long v46;  // x21
    unsigned long long v47;  // x20
    unsigned long long v48;  // x19
    unsigned long long v49;  // x26
    unsigned long long v50;  // x13
    unsigned long long v51;  // x13
    unsigned long long v52;  // x13
    unsigned long v53;  // x13
    unsigned long long k;  // x13
    uint128_t v55;  // q1
    uint128_t v56;  // q3
    uint128_t v57;  // q1
    uint128_t v58;  // q3
    unsigned long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v0;  // [bp-0xac]
    unsigned long v1;  // [bp-0xa8]
    uint128_t v2;  // [bp-0xa0], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x90], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x80], Other Possible Types: uint128_t
    unsigned long long v5[2];  // [bp-0x70], Other Possible Types: uint128_t
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v5[1];
    v9 = iter & 7;
    v10 = a0 + 64;
    if (a0 < iter + i * 64)
    {
        v11 = arm64g_calculate_condition(v15 | 128, v16, v17, v18);
        v12 = 4;
        v13 = (v11 & 1 ? v10 : 0);
        v14 = (v11 & 1 ? iter : 0);
    }
    else
    {
        v19 = arm64g_calculate_condition(v15 | 128, v16, v17, v18);
        v12 = 0;
        v13 = (v19 & 1 ? v10 : 0);
        v14 = (v19 & 1 ? iter : 0);
    }
    v20 = arm64g_calculate_condition(v12 | 144, v13, v14, 0);
    v0 = (unsigned int)!(v20 & 1);
    do
    {
        v21 = i;
        if (v9)
        {
            v2 = *(int128_t *)iter;
            v3 = (int128_t)iter[16];
            v4 = (int128_t)iter[32];
            v5 = (unsigned long long (64 bits)[2])(int128_t)iter[48];
            v22 = *(int128_t *)a0;
            v23 = (int128_t)a0[16];
            v2 ^= v22;
            v3 ^= v23;
            v24 = (int128_t)a0[32];
            v4 ^= v24;
            v25 = (long long)a0[48];
            *(unsigned long *)&v5 = *&v5[0] ^ v25;
            v26 = v1;
        }
        else
        {
            v22 = *(int128_t *)a0;
            v23 = (int128_t)a0[16];
            v2 = v22 ^ *(int128_t *)iter;
            v3 = v23 ^ (int128_t)iter[16];
            v24 = (int128_t)a0[32];
            v4 = v24 ^ (int128_t)iter[32];
            v25 = (long long)a0[48];
            *(unsigned long *)&v5 = (long long)iter[48] ^ v25;
            v26 = iter + 56;
        }
        j = 0;
        v28 = *(unsigned long long *)&*(unsigned long long *)(void*)&v22;
        v29 = *(unsigned long long *)((void*)&v22 + 8);
        v30 = *(unsigned long long *)&*(unsigned long long *)(void*)&v23;
        v31 = *(unsigned long long *)((void*)&v23 + 8);
        v32 = *(unsigned long long *)&*(unsigned long long *)(void*)&v24;
        v33 = *(unsigned long long *)((void*)&v24 + 8);
        v34 = (long long)a0[56];
        *(long long *)((char *)&v5 + 8) = *(long long *)v26 ^ (long long)a0[56];
        do
        {
            v35 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v28 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v34 * 64 | v34 >> 58) & 0x3fc0 & 0x3fff));
            v36 = *(long long *)((char *)&g_df9bc8.field_0 + j + 0x4000) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v28 * 64 | v28 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v29 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 2 & 0x3fc0) + 8);
            v37 = *(long long *)((char *)&g_df9bc8.field_0 + ((v29 * 64 | v29 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v30 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 10 & 0x3fc0) + 16);
            v38 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v30 * 64 | v30 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v31 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 18 & 0x3fc0) + 24);
            v39 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v31 * 64 | v31 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v32 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 26 & 0x3fc0) + 32);
            v40 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v32 * 64 | v32 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v33 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v25 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 0x22 & 0x3fc0) + 40);
            v41 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v33 * 64 | v33 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v25 >> 50) | 56) & 0x3ff8)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v34 >> 42 & 0x3fc0) + 48);
            v25 = *(long long *)((char *)&g_df9bc8.field_0 + (v29 >> 0x22 & 0x3fc0) + 40) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v28 >> 42 & 0x3fc0) + 48) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v30 >> 26 & 0x3fc0) + 32) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v31 >> 18 & 0x3fc0) + 24) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v32 >> 10 & 0x3fc0) + 16) ^ *(long long *)((char *)&g_df9bc8.field_0 + (v33 >> 2 & 0x3fc0) + 8) ^ *(long long *)((char *)&g_df9bc8.field_0 + ((v25 * 64 | v25 >> 58) & 0x3fc0 & 0x3fff)) ^ *(long long *)((char *)&g_df9bc8.field_0 + (((unsigned int)(v34 >> 50) | 56) & 0x3ff8));
            v42 = (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v2 + 7)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v2 + 14)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v3 + 5)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v3 + 12)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v4 + 3)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v4 + 10)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v5 + 1)] ^ (&g_df9bc8.field_0)[8 * *(char *)((void*)&v5 + 8)] ^ v35;
            v43 = (&g_df9bc8.field_0)[8 * (char)v2] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v2 + 15)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v3 + 6)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v3 + 13)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v4 + 4)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v4 + 11)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v5 + 2)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v5 + 9)] ^ v36;
            v44 = (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v2 + 1)] ^ (&g_df9bc8.field_0)[8 * *(char *)((void*)&v2 + 8)] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v3 + 7)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v3 + 14)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v4 + 5)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v4 + 12)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v5 + 3)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v5 + 10)] ^ v37;
            v45 = (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v2 + 2)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v2 + 9)] ^ (&g_df9bc8.field_0)[8 * (char)v3] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v3 + 15)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v4 + 6)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v4 + 13)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v5 + 4)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v5 + 11)] ^ v38;
            v46 = (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v2 + 3)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v2 + 10)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v3 + 1)] ^ (&g_df9bc8.field_0)[8 * *(char *)((void*)&v3 + 8)] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v4 + 7)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v4 + 14)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v5 + 5)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v5 + 12)] ^ v39;
            v47 = (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v2 + 4)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v2 + 11)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v3 + 2)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v3 + 9)] ^ (&g_df9bc8.field_0)[8 * (char)v4] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v4 + 15)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v5 + 6)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v5 + 13)] ^ v40;
            v48 = (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v2 + 5)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v2 + 12)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v3 + 3)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v3 + 10)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v4 + 1)] ^ (&g_df9bc8.field_0)[8 * *(char *)((void*)&v4 + 8)] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v5 + 7)] ^ (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v5 + 14)] ^ v41;
            v49 = (&g_df9bc8.field_0)[6 + 8 * *(char *)((void*)&v2 + 6)] ^ (&g_df9bc8.field_0)[5 + 8 * *(char *)((void*)&v2 + 13)] ^ (&g_df9bc8.field_0)[4 + 8 * *(char *)((void*)&v3 + 4)] ^ (&g_df9bc8.field_0)[3 + 8 * *(char *)((void*)&v3 + 11)] ^ (&g_df9bc8.field_0)[2 + 8 * *(char *)((void*)&v4 + 2)] ^ (&g_df9bc8.field_0)[1 + 8 * *(char *)((void*)&v4 + 9)] ^ (&g_df9bc8.field_0)[8 * (char)v5] ^ (&g_df9bc8.field_0)[7 + 8 * *(char *)((void*)&v5 + 15)] ^ v25;
            v2 = CONCAT(v44, v43);
            v3 = CONCAT(v46, v45);
            v4 = CONCAT(v48, v47);
            v5 = CONCAT(v42, v49);
            j += 8;
            v34 = v35;
            v28 = v36;
            v29 = v37;
            v30 = v38;
            v31 = v39;
            v32 = v40;
            v33 = v41;
        } while (j != 80);
        if (!v9)
        {
            v50 = (long long)a0[8];
            *(unsigned long long *)a0 = *(long long *)iter ^ *(long long *)a0 ^ v43;
            *(unsigned long long *)&a0[8] = (long long)iter[8] ^ v50 ^ v44;
            v51 = (long long)a0[24];
            *(unsigned long long *)&a0[16] = (long long)iter[16] ^ (long long)a0[16] ^ v45;
            *(unsigned long long *)&a0[24] = (long long)iter[24] ^ v51 ^ v46;
            v52 = (long long)a0[40];
            *(unsigned long long *)&a0[32] = (long long)iter[32] ^ (long long)a0[32] ^ v47;
            *(unsigned long long *)&a0[40] = (long long)iter[40] ^ v52 ^ v48;
            v53 = (long long)a0[56];
            *(unsigned long long *)&a0[48] = (long long)iter[48] ^ (long long)a0[48] ^ v49;
            *(unsigned long long *)&a0[56] = (long long)iter[56] ^ v53 ^ v42;
        }
        else if (v0)
        {
            k = 0;
            do
            {
                *((char *)a0 + k) = *((char *)iter + k) ^ *((char *)&v2 + k) ^ *((char *)a0 + k);
                k += 1;
            } while (k != 64);
        }
        else
        {
            v55 = v3 ^ (int128_t)iter[16];
            v56 = (int128_t)a0[16];
            *(uint128_t *)a0 = *(int128_t *)a0 ^ v2 ^ *(int128_t *)iter;
            *(uint128_t *)&a0[16] = v56 ^ v55;
            v57 = v5 ^ (int128_t)iter[48];
            v58 = (int128_t)a0[48];
            *(uint128_t *)&a0[32] = (int128_t)a0[32] ^ v4 ^ (int128_t)iter[32];
            *(uint128_t *)&a0[48] = v58 ^ v57;
        }
        iter += 64;
        i = v21 - 1;
    } while (i);
    return a0;
}
