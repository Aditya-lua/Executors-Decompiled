/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7bf38..0xa7c0a8 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7bf38_0 {
    char padding_0[8];
    struct st_a7bf38_0 *field_8;
    struct st_a7bf38_0 *field_10;
    char padding_18[4];
    unsigned int field_1c;
} st_a7bf38_0;


st_a7bf38_0 * sub_a7bf38(unsigned long long a0, unsigned long a1)
{
    unsigned long long v2;  // x25
    st_a7bf38_0 *v3;  // x0
    st_a7bf38_0 *v4;  // x19
    st_a7bf38_0 *v5;  // x20
    st_a7bf38_0 *v6;  // w0
    st_a7bf38_0 *v7;  // x21
    st_a7bf38_0 *v8;  // x20
    st_a7bf38_0 *v9;  // x23
    st_a7bf38_0 *v10;  // x24
    st_a7bf38_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (2 < a0)
        v2 = a0;
    else
        v2 = 2;
    v3 = sub_a67ad8();
    if (!v3)
        return 0;
    v4 = sub_a6bffc(336, "crypto/threads_pthread.c", 554);
    if (!v4)
        return v4;
    v4->field_8 = v3;
    if (!_pthread_mutex_init(&v4[1].field_10, 0))
    {
        v5 = v4 + 7;
        v6 = (st_a7bf38_0 *)(unsigned int)_pthread_mutex_init(v5, 0);
        if (!v6)
            v7 = v5;
        else
            v7 = 0;
        if (v6 || (v8 = &v4[3].field_10, _pthread_mutex_init(v8, 0)))
        {
            v8 = 0;
LABEL_a7bfd4:
            v9 = 0;
LABEL_a7bfd8:
            v10 = 0;
        }
        else
        {
            v9 = v4 + 9;
            if (_pthread_cond_init(v9, 0))
                goto LABEL_a7bfd4;
            v10 = &v4[5].field_10;
            if (_pthread_cond_init(v10, 0))
                goto LABEL_a7bfd8;
            v11 = sub_a6bffc((v2 * 8 | v2 >> 61) & 0x7fffffff8 & 0x7ffffffff, "crypto/threads_pthread.c", 439);
            v4->field_1c = v2;
            v4->field_10 = v11;
            if (v11)
                return v4;
        }
        _pthread_mutex_destroy(&v4[1].field_10);
        if (!v6)
            _pthread_mutex_destroy(v7);
        if (v8)
            _pthread_mutex_destroy(v8);
        if (v9)
            _pthread_cond_destroy(v9);
        if (v10)
            _pthread_cond_destroy(v10);
    }
    sub_a6c2e4(v4->field_10, "crypto/threads_pthread.c", 590);
    sub_a6c2e4(v4, "crypto/threads_pthread.c", 591);
    return 0;
}
