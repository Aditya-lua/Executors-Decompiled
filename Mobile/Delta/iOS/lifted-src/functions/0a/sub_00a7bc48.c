/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7bc48..0xa7bd78 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7bc48_0 {
    char padding_0[8];
    long long field_8;
} st_a7bc48_0;

typedef struct st_a7bc48_1 {
    struct st_a7bc48_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_a7bc48_0 *field_10;
    char field_18;
    char padding_19[15];
    struct st_a7bc48_0 *field_28;
    char field_30;
    char padding_31[15];
    struct st_a7bc48_0 *field_40;
    char field_48;
    char padding_49[15];
    struct st_a7bc48_0 *field_58;
    char field_60;
    char padding_61[15];
    struct st_a7bc48_0 *field_70;
    char field_78;
    char padding_79[15];
    struct st_a7bc48_0 *field_88;
    char field_90;
    char padding_91[15];
    struct st_a7bc48_0 *field_a0;
    char field_a8;
    char padding_a9[15];
    struct st_a7bc48_0 *field_b8;
    char field_c0;
    char padding_c1[15];
    struct st_a7bc48_0 *field_d0;
    char field_d8;
    char padding_d9[15];
    struct st_a7bc48_0 *field_e8;
} st_a7bc48_1;


st_a7bc48_1 * sub_a7bc48(st_a7bc48_0 *a0)
{
    st_a7bc48_1 *count;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    count = _pthread_getspecific(*(long long *)sub_a684ec(a0->field_8));
    if (count->field_10 != a0)
    {
        if (count->field_28 == a0)
        {
            count = &count->field_18;
        }
        else if (count->field_40 == a0)
        {
            count = &count->field_30;
        }
        else if (count->field_58 == a0)
        {
            count = &count->field_48;
        }
        else if (count->field_70 == a0)
        {
            count = &count->field_60;
        }
        else if (count->field_88 == a0)
        {
            count = &count->field_78;
        }
        else if (count->field_a0 == a0)
        {
            count = &count->field_90;
        }
        else if (count->field_b8 == a0)
        {
            count = &count->field_a8;
        }
        else if (count->field_d0 == a0)
        {
            count = &count->field_c0;
        }
        else if (count->field_e8 == a0)
        {
            count = &count->field_d8;
        }
        else
        {
            return count;
        }
    }
    v3 = count->field_8;
    count->field_8 = v3 - 1;
    if (v3 != 1)
        return count;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if (/* unsupported instruction */)
    {
        count->field_0 = 0;
        count->field_10 = 0;
        return count;
    }
    sub_a69928("assertion failed: ret != UINT64_MAX", "crypto/threads_pthread.c", 364);
}
