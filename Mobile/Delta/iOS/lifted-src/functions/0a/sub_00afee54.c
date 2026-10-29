/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafee54..0xafef78 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afee54_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_afee54_0;


void* sub_afee54(st_afee54_0 *a0)
{
    void* v2;  // x19
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    void* v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(72, "providers/implementations/asymciphers/rsa_enc.c", 339);
    if (!v2)
        return v2;
    v3 = a0->field_10;
    *(uint128_t *)v2 = a0->field_0;
    *(uint128_t *)&v2[16] = v3;
    v4 = a0->field_30;
    *(uint128_t *)&v2[32] = a0->field_20;
    *(uint128_t *)&v2[48] = v4;
    *(unsigned long long *)&v2[64] = a0->field_40;
    if (!(long long)v2[8] || sub_ab146c((long long)v2[8]))
    {
        if ((long long)v2[24] && !sub_a40a98((long long)v2[24]))
        {
            sub_ab1360((long long)v2[8]);
        }
        else if ((long long)v2[32] && !sub_a40a98((long long)v2[32]))
        {
            sub_ab1360((long long)v2[8]);
            sub_a3f52c((long long)v2[24]);
        }
        else if ((long long)v2[40])
        {
            v5 = sub_a6dac4((long long)v2[40], (long long)v2[48], "providers/implementations/asymciphers/rsa_enc.c", 363);
            *(void* *)&v2[40] = v5;
            if (v5)
                return v2;
            sub_ab1360((long long)v2[8]);
            sub_a3f52c((long long)v2[24]);
            sub_a3f52c((long long)v2[32]);
            sub_a6c2e4((long long)v2[40], "providers/implementations/asymciphers/rsa_enc.c", 326);
        }
        else
        {
            return v2;
        }
    }
    sub_a6c2e4(v2, "providers/implementations/asymciphers/rsa_enc.c");
    return 0;
}
