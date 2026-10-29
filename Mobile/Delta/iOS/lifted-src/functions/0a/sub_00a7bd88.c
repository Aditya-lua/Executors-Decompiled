/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7bd88..0xa7befc (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7bd88_2 {
    struct st_a7bd88_1 *field_0;
    char padding_8[8];
    struct st_a7bd88_1 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
} st_a7bd88_2;

typedef struct st_a7bd88_0 {
    unsigned long long field_0;
} st_a7bd88_0;

typedef struct st_a7bd88_1 {
    struct st_a7bd88_0 *field_0;
} st_a7bd88_1;


unsigned long long sub_a7bd88(st_a7bd88_2 *a0)
{
    st_a7bd88_0 **v2;  // x19
    unsigned long v3;  // x8
    unsigned int v4;  // w9
    unsigned long v5;  // x21
    unsigned int v6;  // w8
    unsigned int i;  // w22
    unsigned long long count;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    _pthread_mutex_lock(a0 + 1);
    v2 = a0->field_0;
    a0->field_0 = 0;
    _pthread_mutex_unlock(a0 + 1);
    _pthread_mutex_lock(&a0[2].field_10);
    v3 = a0->field_1c;
    v4 = a0->field_2c;
    if (1 >= (unsigned int)(v3 - a0->field_2c))
    {
        do
        {
            _pthread_cond_wait(&a0[3].field_20, &a0[2].field_10);
            v3 = a0->field_1c;
            v4 = a0->field_2c;
        } while ((unsigned int)(v3 - v4) < 2);
    }
    v5 = a0->field_28;
    v6 = (unsigned int)v5 + 1 - (unsigned int)v3 * (unsigned int)(((unsigned int)v5 + 1) / v3);
    a0->field_28 = v6;
    a0->field_2c = v4 + 1;
    i = a0->field_18;
    a0->field_18 = i + 1;
    /* unsupported instruction */;
    a0->field_20 = v6;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    _pthread_cond_signal(&a0[3].field_20);
    _pthread_mutex_unlock(&a0[2].field_10);
    _pthread_mutex_lock(&a0[4].field_20);
    while (a0->field_24 != i)
    {
        _pthread_cond_wait(a0 + 6, &a0[4].field_20);
    }
    do
    {
        /* unsupported instruction */;
    } while (*(long long *)&a0->field_10[v5]);
    a0->field_24 = a0->field_24 + 1;
    _pthread_cond_broadcast(a0 + 6);
    _pthread_mutex_unlock(&a0[4].field_20);
    _pthread_mutex_lock(&a0[2].field_10);
    a0->field_2c = a0->field_2c - 1;
    _pthread_cond_signal(&a0[3].field_20);
    count = _pthread_mutex_unlock(&a0[2].field_10);
    if (!v2)
        return count;
    (*v2)();
}
